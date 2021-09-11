package pertemuan1.Tugas;

public class SmartwatchDemo {
    public static void main(String[] args) {
        Smartwatch sw1 = new Smartwatch();
        
        sw1.setMerek("Realme");
        sw1.setWarna("Black");
        sw1.ubahMode("Realtime blood oxymeter");
        sw1.cetakInfo();
    }
}
