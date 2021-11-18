package pertemuan12.percobaan1;
public class Tester2 {
    public static void main(String[] args) {
        PermanentEmpolyee pEmp = new PermanentEmpolyee("Dedik", 500);
        Employee e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("--------------------");
        System.out.println(""+pEmp.getEmployeeInfo());
    }
}
