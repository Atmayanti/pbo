package uts;
public class Honda extends Mobil{
    public String merk;
    public int nomerRangka, nomerMesin;
    
    public void DataHonda(){
        super.DataMobil();
        System.out.println("Merk Mobil\t: "+merk);
        System.out.println("Nomer Rangka\t: "+nomerRangka);
        System.out.println("Nomer Mesin\t: "+nomerMesin);
    }
}
