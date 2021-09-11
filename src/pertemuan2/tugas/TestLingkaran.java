package pertemuan2.tugas;
import java.util.Scanner;
public class TestLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lingkaran ling = new Lingkaran();
        System.out.println("========Program Lingkaran========");
        System.out.print("Phi Lingkaran       : ");
        ling.phi=sc.nextDouble();
        System.out.print("Jari-jari Lingkaran : ");
        ling.r=sc.nextDouble();
        System.out.println("Luas Lingkaran      : "+ling.hitungLuas());
        System.out.println("Keliling Lingkaran  : "+ling.hitungKeliling());
        System.out.println("=================================");
    }
}
