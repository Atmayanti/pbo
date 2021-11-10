package pertemuan11.interfacelatihan;

import pertemuan11.interfacelatihan.Mahasiswa;
import pertemuan11.interfacelatihan.PascaSarjana;
import pertemuan11.interfacelatihan.Rektor;
import pertemuan11.interfacelatihan.Sarjana;

public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        //pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);

    }
}
