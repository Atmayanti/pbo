package pertemuan7.tugas;

public class Mac extends Leptop{
    public String security;

    public Mac() {
    }

    public Mac(String security, String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilLeptop();
        System.out.println("Security\t\t: "+security);
    }
}
