package pertemuan3.tugas;

public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        if (newAge <= 30 && newAge >= 18) {
            age = newAge;
        } else {
            System.out.println("Umur yang dimasukkan tidak valid");
        }
    }
}
