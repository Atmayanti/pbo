package pertemuan11.tugas;
public class Gorilla extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayMakan(){
        System.out.println("Jenis \t\t: Karnivora + Herbivora");
        System.out.println("Makanan \t: Daging + Tumbuhan");
    };
    
    @Override
    public void displayBinatang(){
        System.out.println("Nama \t\t: "+nama);
        System.out.println("Jumlah kaki \t: "+jmlKaki);
    };
    
    public void displayData(){
        System.out.println("Suara \t\t: "+suara);
        System.out.println("Warna bulu \t: "+warnaBulu);
    }
}
