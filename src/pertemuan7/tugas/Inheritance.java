package pertemuan7.tugas;

public class Inheritance {

    public static void main(String args[]) {
        //Komputer
        System.out.println("=======================KOMPUTER========================");
        Komputer k = new Komputer("Lenovo", "Intel Pentium", 1200, 4);
        k.tampilData();
        
        //Laptop
        System.out.println("=========================LAPTOP========================");
        Leptop l = new Leptop("Lithium Ion 7000 MAh", "ASUS", "Intel Core I5", 2000, 8);
        l.tampilLeptop();
        
        //PC
        System.out.println("==========================PC===========================");
        Pc p = new Pc(20, "MSI", "Intel Core I7", 5000, 8);
        p.tampilPc();
        
        //Mac
        System.out.println("==========================MAC==========================");
        Mac m = new Mac("Fingerprint", "Lithium Ion 5000 MAh","Macbook Air 14", "Intel Core I3", 2500, 8);
        m.tampilMac();
        
        //Windows
        System.out.println("========================WINDOWS========================");
        Windows w = new Windows("XBOX", "Lithium Ion 6000 MAh", "Acer", "AMD Ryzen 5", 2100, 8);
        w.tampilWindows();
    }
}
