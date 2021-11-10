package pertemuan11.interfacelatihan;
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalkan diri anda..");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("===========================================");
    }   
}
