package jti.relasiclass.pertemuan4.tugas;

import java.time.LocalDate;
public class Konsultasi {
    private LocalDate tanggal;
    private Pegawai dokter;
    private Pegawai perawat;
    private Obat obat;
    
    public LocalDate getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(LocalDate tanggal){
        this.tanggal = tanggal;
    }
    
    public Pegawai getDokter(){
        return dokter;
    }
    
    public void setDokter(Pegawai dokter){
        this.dokter = dokter;
    }
    
    public Pegawai getPerawat(){
        return perawat;
    }
    
    public void setPerawat(Pegawai perawat){
        this.perawat = perawat;
    }
    
    public Obat getObat(){
        return obat;
    }
    
    public void setObat(Obat obat){
        this.obat = obat;
    }
    
    public String getInfo(){
        String info = "";
        info += "\tTanggal : " + tanggal;
        info += ", Dokter : " + dokter.getInfo();
        info += ", Perawat : " + perawat.getInfo();
        info += ", Obat : " + obat.getInfo();
        info += "\n";
        
        return info;
    }
}
