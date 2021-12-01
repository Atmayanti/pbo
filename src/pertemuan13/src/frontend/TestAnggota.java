package frontend;
import backend.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TestAnggota {

    public static void main(String[] args)
    {
        Anggota ag1 = new Anggota("Atma", "Jalan Jalan Aja", "08123456789");
        Anggota ag2 = new Anggota("Yanti", "Jalan Sama Kamu", "08987654321");
        Anggota ag3 = new Anggota("Atmayanti", "Jalan Kenangan", "08555555555");

        // test insert
        ag1.save();
        ag2.save();
        ag3.save();

        // test update
        ag2.setAlamat("Jalan Sendirian");

        // test delete
        ag3.delete();

        // test select all
        for (Anggota a : new Anggota().getAll()){
            System.out.println("Nama: "+a.getNama()+", Alamat: "+a.getAlamat()+", Telp: "+ a.getTelepon());
        }

        // test search
        for (Anggota a : new Anggota().search("Atma")){
            System.out.println("Nama: "+a.getNama()+", Alamat: "+a.getAlamat()+", Telp: "+a.getTelepon());
        }
    }
}
