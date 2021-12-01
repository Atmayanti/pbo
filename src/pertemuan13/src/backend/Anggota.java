package backend;

import java.util.ArrayList;
import java.sql.*;

public class Anggota {

    private int idAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota(){

    }

    public Anggota(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota getById(int id){
        Anggota ang = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota "
                + " WHERE idAnggota= '"+ id+"'");

        try{
            while(rs.next())
            {
                ang = new Anggota();
                ang.setIdAnggota(rs.getInt("idAnggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return ang;
    }

    public ArrayList<Anggota> getAll(){
        ArrayList<Anggota> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");

        try{
            while(rs.next())
            {
                Anggota ang = new Anggota();
                ang.setIdAnggota(rs.getInt("idAnggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));

                ListAnggota.add(ang);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public ArrayList<Anggota> search(String keyword){
        ArrayList<Anggota> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE "
                + "     nama LIKE '%" + keyword + "%'"
                + "     OR alamat LIKE '%" +keyword + "%' "
                + "     OR telepon LIKE '%" +keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try{
            while(rs.next())
            {
                Anggota ang = new Anggota();
                ang.setIdAnggota(rs.getInt("idAnggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return ListAnggota;

    }

    public void save(){
        if(getById(idAnggota).getIdAnggota() == 0)
        {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + "     '"+ this.nama + "', "
                    + "     '"+ this.alamat+ "', "
                    + "     '"+ this.telepon+ "' "
                    + "     )";
            this.idAnggota = DBHelper.insertQueryGetId(SQL);
        }
        else
        {
            String SQL = "UPDATE anggota SET "
                    + "     nama = '" + this.nama + "', "
                    + "     alamat = '" + this.alamat+ "', "
                    + "     telepon = '" + this.telepon+ "' "
                    + "     WHERE idAnggota = '" + this.idAnggota + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete(){
        String SQL = "DELETE FROM anggota WHERE idAnggota = '" + this.idAnggota + "'";
        DBHelper.executeQuery(SQL);
    }
}
