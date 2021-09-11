package Pertemuan1.Tugas;

public class Smartwatch {
     private String merek;
     private String warna;
     private String mode;
     
     public void setMerek(String newValue){
         merek = newValue;
     }
     public void setWarna(String newValue){
         warna = newValue;
     }
     public void ubahMode(String newValue){
         mode = newValue;
     }
     public void cetakInfo(){
         System.out.println("Merek: "+ merek);
         System.out.println("Warna: "+ warna);
         System.out.println("Mode: "+ mode);
     }
}
