package pertemuan2.tugas;

public class Member extends VideoGame{
    public int idMember;
    public int lamaPinjam;
    public String namaMember;
    public String alamat;
    
    public void tampilBiodata(){
        System.out.println("===========Biodata Member============");
        System.out.println("Id Member   : "+idMember);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Alamat : "+alamat);
    }
    
    public int bayar(){
        int totalBayar = super.harga * lamaPinjam;
        return totalBayar;
    }
    
    public void tampilPeminjaman(){
        System.out.println("=============Peminjaman==============");
        System.out.println("Id Member   : "+idMember);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game   : "+super.namaGame);
        System.out.println("Harga Game  : "+super.harga);  
        System.out.println("Lama Pinjam : "+lamaPinjam+" hari");  
    }
}
