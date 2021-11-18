package pertemuan12.percobaan1;
public class Tester {
    public static void main(String[] args) {
        PermanentEmpolyee pEmp = new PermanentEmpolyee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "Aa-1");
        Employee e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
