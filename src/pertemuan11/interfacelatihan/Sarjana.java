package pertemuan11.interfacelatihan;
public class Sarjana extends Mahasiswa implements ICumlaude{
    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void kuliahDiKampus() {
        super.kuliahDiKampus(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
