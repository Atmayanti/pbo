package uts;
public class Toyota extends Mobil{
    public String merk;
    public int nomerRangka, nomerMesin;
    
    public void DataToyota(){
        super.DataMobil();
        System.out.println("Merk Mobil\t: "+merk);
        System.out.println("Nomer Rangka\t: "+nomerRangka);
        System.out.println("Nomer Mesin\t: "+nomerMesin);
    }
}