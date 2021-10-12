package pertemuan6.tugas;

public class Dosen extends Pegawai{
    public int jumlahSKS = 0;
    public int tarifSKS = 50000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    public void setSKS(int sks){
        jumlahSKS += sks;
    }
    public int getGaji(){
        gaji = super.getGaji()+ (jumlahSKS * tarifSKS);
        return gaji;
    }
}
