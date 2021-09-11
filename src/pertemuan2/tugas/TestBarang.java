package pertemuan2.tugas;
public class TestBarang {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.kode="A1001";
        b1.namaBarang="Kipas Angin";
        b1.hargaDasar=100000;
        b1.diskon=(float) 10/100; //10%
        b1.hitungHargaJual();
        b1.tampilData();
    }
}