package uts;
public class Avanza extends Toyota{
    public String warna;
    public int CC;
    
    public void DataAvanza() {
        super.DataToyota();
        System.out.println("Warna Mobil\t: " + warna);
        System.out.println("CC Mobil\t: " + CC);
    }
}