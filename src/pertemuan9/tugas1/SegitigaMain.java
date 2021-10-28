package pertemuan9.tugas1;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("----------Program Perhitungan Segitiga----------\n");
        System.out.println("Total Sudut 1\t: "+s.totalSudut(20));
        System.out.println("Total Sudut 2\t: "+s.totalSudut(20, 90));
        System.out.println("Keliling 1\t: "+s.keliling(30, 40, 50));
        System.out.println("Keliling 2\t: "+s.keliling(30, 40));
        System.out.println("------------------------------------------------\n");
    }
}
