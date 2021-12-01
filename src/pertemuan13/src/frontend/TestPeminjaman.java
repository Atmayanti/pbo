package frontend;

import backend.Anggota;
import backend.Buku;
import backend.Peminjaman;

public class TestPeminjaman {
    public static void main(String[] args) {
        Anggota a1 = new Anggota().getById(1);
        Anggota a2 = new Anggota().getById(2);

        Buku buku1 = new Buku().getById(28);
        Buku buku2 = new Buku().getById(29);
        Buku buku3 = new Buku().getById(30);

        Peminjaman p1 = new Peminjaman(a1,buku2,"2021/12/01","2021/12/08");
        Peminjaman p2 = new Peminjaman(a2,buku3,"2021/12/02","2021/12/09");
        Peminjaman p3 = new Peminjaman(a2,buku1,"2021/12/02","2021/12/09");

        // test insert
        p1.save();
        p2.save();

        // test update
        p1.setBuku(buku1);
        p1.save();

        // test delete
        p3.delete();

        // test select all
        for (Peminjaman p: new Peminjaman().getAll()) {
            System.out.println("Nama Anggota: " + p.getAnggota().getNama() +
                ", Judul Buku: " + p.getBuku().getJudul() +
                ", Tanggalkembali: " + p.getTglKembali());
        }
    }
}

