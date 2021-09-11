package pertemuan2.tugas;

public class Member extends VideoGame{
    public int idMember;
    public String namaMember;
    public String alamat;
    
    public void tampilBiodata(){
        System.out.println("===========Biodata Member============");
        System.out.println("Id Member   : "+idMember);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Alamat : "+alamat);
    }
    
    public void meminjam(int idM, String nmM, String nmG, int hargaGame){
        idM = idM;
        nmM = nmM;
        super.namaGame = nmG;
        super.harga = hargaGame;
    }
    
    public void tampilPeminjaman(){
        System.out.println("=============Peminjaman==============");
        System.out.println("Id Member   : "+idMember);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game   : "+super.namaGame);
        System.out.println("Harga Game  : "+super.harga);  
    }
    
    public int bayar(){
        return super.harga;
    }
}
