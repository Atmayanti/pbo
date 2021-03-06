package frontend;
import backend.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TestBackend {

    public static void main(String[] args)
    {
//        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
//        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
//        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
        Anggota ag1 = new Anggota("Atma", "Jalan Jalan Aja", "08123456789");
        Anggota ag2 = new Anggota("Yanti", "Jalan Sama Kamu", "08987654321");
        Anggota ag3 = new Anggota("Atmayanti", "Jalan Kenangan", "08555555555");

        // test insert
//        kat1.save();
//        kat2.save();
//        kat3.save();
        ag1.save();
        ag2.save();
        ag3.save();

        // test update
//        kat2.setKeterangan("Koleksi buku referensi ilmiah");
//        kat2.save();
        ag2.setAlamat("Jalan Sendirian");

        // test delete
//        kat3.delete();
        ag3.delete();

        // test select all
//        for(Kategori k : new Kategori().getAll())
//        {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
        for (Anggota a : new Anggota().getAll()){
            System.out.println("Nama: "+a.getNama()+", Alamat: "+a.getAlamat()+", Telp: "+ a.getTelepon());
        }

        // test search
//        for(Kategori k : new Kategori().search("ilmiah"))
//        {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
        for (Anggota a : new Anggota().search("Atma")){
            System.out.println("Nama: "+a.getNama()+", Alamat: "+a.getAlamat()+", Telp: "+a.getTelepon());
        }
    }
}
