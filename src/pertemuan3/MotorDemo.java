package pertemuan3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        
        motor.nyalakanMesin();
        motor.tambahKecepatan();
        motor.printStatus();
        
        // manambah kecepatan hingga 100
        for (int i = 0; i < 20; i++) {
            motor.tambahKecepatan();
        }
        motor.printStatus();
        
        motor.kurangiKecepatan();
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
    }
}
