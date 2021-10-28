package pertemuan9.tugas1;

public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA+sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double keliling(int sisiA, int sisiB){
        double c = (Math.sqrt(Math.pow(sisiA, 2)+Math.pow(sisiB, 2)));
        return sisiA + sisiB + c;
    }
}
