package pertemuan7.tugas;

public class Pc extends Komputer{
    public int ukuranMonitor;

    public Pc() {
    }

    public Pc(int ukuranMonitor, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPc(){
        super.tampilData();
        System.out.println("Ukuran Monitor\t\t: "+ukuranMonitor);
    }
}
