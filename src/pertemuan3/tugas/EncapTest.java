package pertemuan3.tugas;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        
        //umur lebih dari batas
        encap.setName("James");
        System.out.println("Name : "+encap.getName());
        encap.setAge(35);
        System.out.println();
        
        //umur dalam batas
        encap.setName("Jacob");
        encap.setAge(30);
        System.out.println("Name : "+encap.getName());
        System.out.println("Age : "+encap.getAge());
        System.out.println();
        
        //umur kurang dari batas
        encap.setName("Jason");
        System.out.println("Name : "+encap.getName());
        encap.setAge(15);
        System.out.println();
    }
}
