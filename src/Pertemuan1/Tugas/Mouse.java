package Pertemuan1.Tugas;

public class Mouse {
     private String merek;
     private int dpi;
     
     public void setMerek(String newValue){
         merek = newValue;
     }
     public void tambahDPI(int increment){
         dpi += increment;
     }
     public void kurangiDPI(int decrement){
         dpi -= decrement;
     }
     public void cetakInfo(){
         System.out.println("Merek: "+ merek);
         System.out.println("DPI: "+ dpi);
     }
}
