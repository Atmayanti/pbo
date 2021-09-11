package Pertemuan1.Tugas;

public class MouseDemo {
    public static void main(String[] args) {
        Mouse mo1 = new Mouse();
        MouseWireless mo2 = new MouseWireless();
        MouseWired mo3 = new MouseWired();
        
        System.out.println("------------------------------");
        mo1.setMerek("Logitech");
        mo1.tambahDPI(1600);
        mo1.kurangiDPI(400);
        mo1.cetakInfo();
        
        System.out.println("------------------------------");
        mo2.setMerek("Armageddon");
        mo2.tambahDPI(3200);
        mo2.kurangiDPI(1600);
        mo2.setKoneksi("Bluetooth 5.0");
        mo2.setJarak(20);
        mo2.cetakInfo();
        
        System.out.println("------------------------------");
        mo3.setMerek("Votre");
        mo3.tambahDPI(1600);
        mo3.setPanjangKabel(1);
        mo3.setTipePort("USB");
        mo3.cetakInfo();
        System.out.println("------------------------------");
    }
}
