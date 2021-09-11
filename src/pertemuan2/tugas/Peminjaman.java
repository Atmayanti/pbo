package pertemuan2.tugas;

public class Peminjaman{
    public static void main(String[] args) {
        Member m1 = new Member();
        
        m1.idMember=101;
        m1.namaMember="Budi";
        m1.alamat="Jakarta";
        m1.idGame=1001;
        m1.namaGame="God of War";
        m1.harga=10000;
        m1.tampilBiodata();
        m1.tampilDataGame();
        m1.meminjam(101, "Budi", "God of War", 10000);
        m1.tampilPeminjaman();
        System.out.println("=============Pembayaran==============");
        System.out.println("Harga yang harus dibayar : Rp"+m1.bayar()+",-");
        System.out.println("=====================================");
    }   
}
