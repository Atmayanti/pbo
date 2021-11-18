package pertemuan12.percobaan1;
public class Owner {
    public void pay(Payable p){
        System.out.println("Total payment = "+p.getPaymentAmount());
        if (p instanceof ElectricityBill) {
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println(""+eb.getBillInfo());
        } else if (p instanceof PermanentEmpolyee){
            PermanentEmpolyee pe = (PermanentEmpolyee) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee e){
        System.out.println(""+e.getEmployeeInfo());
        if (e instanceof PermanentEmpolyee) 
            System.out.println("You have to pay her/him monthly!!!");
         else 
           System.out.println("No need to pay him/her :)");
    }
}   
