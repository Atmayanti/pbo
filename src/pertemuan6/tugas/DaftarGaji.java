package pertemuan6.tugas;
import java.util.ArrayList;

public class DaftarGaji {
    public int gaji;
    public Pegawai[] listPegawai;
    
    ArrayList<Pegawai> listPeg = new ArrayList();
    
    public DaftarGaji(int gaji){
        this.gaji = gaji;
    }
    public void addPegawai(Pegawai p){
        p.gaji = p.getGaji() + this.gaji;
        listPeg.add(p);
    }
    public void printSemuaGaji(){
        System.out.println("NIP\t| Nama\t| Alamat\t| Gaji");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < listPeg.size(); i++) {
            System.out.println(listPeg.get(i).nip+"\t| "+listPeg.get(i).nama+
                    "\t| "+listPeg.get(i).alamat+"\t| "+listPeg.get(i).gaji);
        }
    }
}
