package pertemuan7.tugas;

public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;
    
    public Komputer() {
    }

    public Komputer(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilData(){
        System.out.println("Merk\t\t\t: "+merk);
        System.out.println("Kecepatan Processor\t: "+kecProsesor);
        System.out.println("Size Memory\t\t: "+sizeMemory);
        System.out.println("Jenis Processor\t\t: "+jnsProsesor);
    }
}
