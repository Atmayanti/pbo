package jti.relasiclass.pertemuan4.tugas;

import java.time.LocalDate;
public class RumahSakitDemo {
    public static void main(String[] args) {
        //datapegawai (doktor)
        Pegawai budi = new Pegawai("1111", "dr. Budi");
        Pegawai susi = new Pegawai("2222", "dr. Susi");
        
        //datapegawai (perawat)
        Pegawai luki =  new Pegawai ("3333", "Ns. Luki");
        Pegawai wiji =  new Pegawai ("4444", "Ns. Wiji");
        
        //dataobat
        Obat demam = new Obat("Paracetamol", 25000);
        Obat pusing = new Obat("Mixagrip", 50000);
        
        //data1 pasien
        Pasien pasien1 = new Pasien("Atmayanti", "2041720016");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), budi, luki, demam);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), susi, wiji, pusing);
        System.out.println(pasien1.getInfo());
        
        //data2 pasien
        Pasien pasien2 = new Pasien("Maya Yanti", "2041720061");
        System.out.println(pasien2.getInfo());
    }
}
