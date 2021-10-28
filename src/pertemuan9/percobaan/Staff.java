package pertemuan9.percobaan;

public class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }
  
    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }
    
    //Overloading
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji()+lembur*gajiLembur; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getGaji() {
        return super.getGaji()+lembur*gajiLembur; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void lihatInfo(){
        System.out.println("NIP\t\t: "+this.getNip());
        System.out.println("Nama\t\t: "+this.getNama());
        System.out.println("Golongan\t: "+this.getGolongan());
        System.out.println("Jml lembur\t: "+this.getLembur());
        System.out.printf("Gaji lembur\t: %.0f\n",this.getGajiLembur());
        System.out.printf("Gaji\t\t: %.0f\n",this.getGaji());
    }
       
}
