package pertemuan2.tugas;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        float hargaJual = hargaDasar - (diskon*hargaDasar);
        return (int) hargaJual;
    }
    
    public void tampilData(){
        System.out.println("===========Data Barang===========");
        System.out.println("Kode        : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : Rp "+hargaDasar+",-");
        System.out.println("Diskon      : "+(int)(diskon*100)+"%");
        System.out.println("Harga Jual  : Rp "+hitungHargaJual()+",-");
        System.out.println("=================================");
    }
}
