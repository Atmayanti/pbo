package jti.relasiclass.pertemuan4.tugas;

public class Obat {
    private String nama;
    private int harga;

    public Obat(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHargga(int harga){
        this.harga =  harga;
    }
    
    public String getInfo(){
        return nama + " ( Rp." + harga + ",-)";
    }
}
