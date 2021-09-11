package pertemuan1.Tugas;

public class MouseWired extends Mouse{
    private String tipePort;
    private int panjangKabel;
    
    public void setTipePort(String newValue){
        tipePort = newValue;
    }
    public void setPanjangKabel(int newValue){
        panjangKabel = newValue;
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Tipe port: "+ tipePort);
        System.out.println("Panjang kabel: "+ panjangKabel +" m");
    }          
}
