package uts;
    public class Main {
    public static void main(String[] args){
        Mobil m = new Mobil();
        Honda h = new Honda();
        Toyota t = new Toyota();
        Brio b = new Brio();
        Avanza a = new Avanza();
        
        System.out.println("-----------------------------------------");
        System.out.println("               DATA MOBIL                ");
        System.out.println("-----------------------------------------");
        m.jenis = "Hatchback";
        m.transmisi = "Manual";
        m.platNomer = 20211021;
        m.DataMobil();
        
        System.out.println("-----------------------------------------");
        System.out.println("               DATA HONDA                ");
        System.out.println("-----------------------------------------");
        h.jenis = "Hatchback";
        h.transmisi = "Manual";
        h.platNomer = 20211021;
        h.merk = "Honda Brio";
        h.nomerRangka = 19;
        h.nomerMesin = 2041720016;
        h.DataHonda();
        
        System.out.println("-----------------------------------------");
        System.out.println("               DATA TOYOTA               ");
        System.out.println("-----------------------------------------");
        t.jenis = "MPV";
        t.transmisi = "Matic";
        t.platNomer = 21102021;
        t.merk = "Honda Brio";
        t.nomerRangka = 19;
        t.nomerMesin = 2041720016;
        t.DataToyota();
        
        System.out.println("-----------------------------------------");
        System.out.println("             DATA HONDA BRIO             ");
        System.out.println("-----------------------------------------");
        b.jenis = "Hatchback";
        b.transmisi = "Manual";
        b.platNomer = 20211021;
        b.merk = "Honda Brio";
        b.nomerRangka = 19;
        b.nomerMesin = 2041720016;
        b.warna = "Putih";
        b.CC = 06;
        b.DataBrio();
        
        System.out.println("-----------------------------------------");
        System.out.println("            DATA TOYOTA AVANZA           ");
        System.out.println("-----------------------------------------");
        a.jenis = "MPV";
        a.transmisi = "Matic";
        a.platNomer = 21102021;
        a.merk = "Honda Brio";
        a.nomerRangka = 19;
        a.nomerMesin = 2041720016;
        a.warna = "Hitam";
        a.CC = 06;        
        a.DataAvanza();
        System.out.println("-----------------------------------------");
    }
}