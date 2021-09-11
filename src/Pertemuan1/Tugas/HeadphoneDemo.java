package pertemuan1.Tugas;

public class HeadphoneDemo {
    public static void main(String[] args) {
        Headphone hd1 = new Headphone();
        
        hd1.setMerek("SADES");
        hd1.setWarna("Pink");
        hd1.tambahVolume(20);
        hd1.kurangiVolume(2);
        hd1.cetakInfo();
    }
}
