package Pertemuan1.Tugas;

public class Laptop {
     private String merek;
     private String warna;
     private String tipeProcessor;
     private int kecerahanLayar;
     
     public void setMerek(String newValue){
         merek = newValue;
     }
     public void setWarna(String newValue){
         warna = newValue;
     }
     public void setTipeProcessor(String newValue){
         tipeProcessor = newValue;
     }
     public void tambahVolume(int increment){
         kecerahanLayar += increment;
     }
     public void kurangiVolume(int decrement){
         kecerahanLayar -= decrement;
     }
     public void cetakInfo(){
         System.out.println("Merek: "+ merek);
         System.out.println("Warna: "+ warna);
         System.out.println("Tipe Processor: "+ tipeProcessor);
         System.out.println("Kecerahan layar: "+ kecerahanLayar);
     }
}
