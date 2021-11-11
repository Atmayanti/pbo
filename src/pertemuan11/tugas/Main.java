package pertemuan11.tugas;
public class Main {
    public static void main(String args[]) {
        Keledai kel = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
        Gorilla gor = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa sing = new Singa("CingaCing", 4, "Roaaar", "Coklat");
        
        System.out.println("");
        kel.displayMakan();
        kel.displayBinatang();
        kel.displayData();
        
        System.out.println("");
        gor.displayMakan();
        gor.displayBinatang();
        gor.displayData();
        
        System.out.println("");
        sing.displayMakan();
        sing.displayBinatang();
        sing.displayData();
    }
}
