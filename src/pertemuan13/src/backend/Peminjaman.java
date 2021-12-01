package backend;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Peminjaman {
    private int idPeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tglPinjam;
    private String tglKembali;

    public Peminjaman() {
    }

    public Peminjaman(Anggota anggota, Buku buku, String tglPinjam, String tglKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public Peminjaman getById(int id) {
        Peminjaman peminjaman = new Peminjaman();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "p.idpeminjaman AS idpeminjaman, "
                + "a.idanggota AS idanggota, "
                + "a.nama AS nama, "
                + "a.alamat AS alamat, "
                + "a.telepon AS telepon, "

                + "b.idbuku AS idbuku, "
                + "k.idkategori AS idkategori, "
                + "k.nama AS namakategori, "
                + "k.keterangan AS keterangan, "
                + "b.judul AS judul, "
                + "b.penulis AS penulis, "
                + "b.penerbit AS penerbit, "

                + "p.tanggalpinjam AS tanggalpinjam, "
                + "p.tanggalkembali AS tanggalkembali "
                + "FROM peminjaman p "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku "
                + "LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                peminjaman = new Peminjaman();

                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdKategori(rs.getInt( "idKategori"));
                peminjaman.getBuku().getKategori().setNama(rs.getString("namakategori"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.setTglPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTglKembali(rs.getString("tanggalkembali"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return peminjaman;
    }

    public ArrayList<Peminjaman> getAll() { ArrayList<Peminjaman> list = new ArrayList<>();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                        + "p.idpeminjaman AS idpeminjaman, "

                        + "a.idanggota AS idanggota, "
                        + "a.nama AS nama, "
                        + "a.alamat AS alamat, "
                        + "a.telepon AS telepon, "

                        + "b.idbuku AS idbuku, "
                        + "k.idkategori AS idkategori, "
                        + "k.nama AS namakategori, "
                        + "k.keterangan AS keterangan, "
                        + "b.judul AS judul, "
                        + "b.penulis AS penulis, "
                        + "b.penerbit AS penerbit, "

                        + "p.tanggalpinjam AS tanggalpinjam, "
                        + "p.tanggalkembali AS tanggalkembali "
                        + "FROM peminjaman p "
                        + "LEFT JOIN buku b ON p.idbuku = b.idbuku "
                        + "LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                        + "LEFT JOIN kategori k ON b.idkategori = k.idkategori ");

        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdKategori(rs.getInt( "idKategori"));
                peminjaman.getBuku().getKategori().setNama(rs.getString("namakategori"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.setTglPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTglKembali(rs.getString("tanggalkembali"));
                list.add(peminjaman);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void save() {
        if (getById(idPeminjaman).getIdPeminjaman() == 0) {
            String sql = "INSERT INTO peminjaman (idpeminjaman,idanggota,idbuku,tanggalpinjam,tanggalkembali) VALUES("
                    + "'" + this.idPeminjaman + "', "
                    + "'" + this.getAnggota().getIdAnggota() + "', "
                    + "'" + this.getBuku().getIdBuku() + "', "
                    + "'" + this.tglPinjam + "', "
                    + "'" + this.tglKembali + "')";

            this.idPeminjaman = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE peminjaman SET "
                    + "idanggota = '" + this.getAnggota().getIdAnggota() + "', "
                    + "idbuku = '" + this.getBuku().getIdBuku() + "', "
                    + "tanggalpinjam = '" + this.tglPinjam + "', "
                    + "tanggalkembali = '" + this.tglKembali + "' "
                    + "WHERE idpeminjaman = '" + this.idPeminjaman + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        DBHelper.executeQuery("DELETE FROM peminjaman WHERE idpeminjaman = '"
                + this.idPeminjaman + "'");
    }
}

