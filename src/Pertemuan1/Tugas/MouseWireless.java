package Pertemuan1.Tugas;

public class MouseWireless extends Mouse{
    private String koneksi;
    private int jarak;
    
    public void setKoneksi(String newValue){
        koneksi = newValue;
    }
    public void setJarak(int newValue){
        jarak = newValue;
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Koneksi: "+ koneksi);
        System.out.println("Jarak maksimal: "+ jarak +" m");
    }          
}
