package pertemuan7.tugas;

public class Leptop extends Komputer{
    public String jnsBatrei;

    public Leptop() {
    }

    public Leptop(String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLeptop(){
        super.tampilData();
        System.out.println("Jenis Baterai\t\t: "+jnsBatrei);
    }
}
