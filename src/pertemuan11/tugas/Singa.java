package pertemuan11.tugas;
public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayMakan(){
        System.out.println("Jenis \t\t: Karnivora");
        System.out.println("Makanan \t: Daging");
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
