package pertemuan9.tugas2;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        Manusia m = new Manusia();
        m.bernafas();
        m.makan();
        
        System.out.println("------------------------------");
        Dosen d = new Dosen();
        d.makan();
        d.lembur();
        
        System.out.println("------------------------------");
        Mahasiswa mh = new Mahasiswa();
        mh.makan();
        mh.tidur();
        System.out.println("------------------------------");
    }
}
