package pertemuan7.tugas;

public class Windows extends Leptop{
    public String fitur;

    public Windows() {
    }

    public Windows(String fitur, String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilLeptop();
        System.out.println("Fitur\t\t\t: "+fitur);
    }
}
