package uts;
public class Brio extends Honda{
    public String warna;
    public int CC;
    
    public void DataBrio(){
        super.DataHonda();
        System.out.println("Warna Mobil\t: "+warna);
        System.out.println("CC Mobil\t: "+CC);
    }
}