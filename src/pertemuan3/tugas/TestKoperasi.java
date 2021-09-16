package pertemuan3.tugas;
import java.util.Scanner;

public class TestKoperasi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        char pilihan1, pilihan2;
        do {            
            System.out.print("Apakah anda ingin melakukan pinjaman ? (y/n) ");
            pilihan1 = sc.next().charAt(0);
            if (pilihan1 == 'y' || pilihan1 == 'Y') {
                System.out.print("Masukkan jumlah pinjaman : ");
                donny.pinjam(sc.nextInt());
            } else {
                break;
            }
        } while (pilihan1 != 'n' || pilihan1 != 'N');
        do {            
            System.out.print("Apakah anda ingin melakukan angsuran ? (y/n) ");
            pilihan2 = sc.next().charAt(0);
            if (pilihan2 == 'y' || pilihan2 == 'Y') {
                System.out.print("Masukkan jumlah angsuran : ");
                donny.angsur(sc.nextInt());
            } else {
                break;
            }
            if (donny.getJumlahPinjaman() <= 0) {
                break;
            }
        } while (pilihan2 != 'n' || pilihan2 != 'N');
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
