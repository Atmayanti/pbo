package pertemuan6.tugas;

public class Main {
    public static void main(String[] args) {
        // Pegawai non dosen
        Pegawai atma = new Pegawai("2001", "Atma", "Kediri");
        Pegawai yanti = new Pegawai("2002", "Yanti", "Blitar");
        // Dosen
        Dosen budi = new Dosen("2003", "Budi", "Malang");
        budi.setSKS(20);
        Dosen fitri = new Dosen("2004", "Fitri", "Nganjuk");
        fitri.setSKS(25);
        
        DaftarGaji gaji1 = new DaftarGaji(5000000);
        gaji1.addPegawai(atma);
        gaji1.addPegawai(yanti);
        gaji1.addPegawai(budi);
        gaji1.addPegawai(fitri);
        gaji1.printSemuaGaji();
    }
}
