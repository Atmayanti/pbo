package pertemuan2;

public class TestMahasiswa {
    public static void main(String args[]) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        System.out.println("========Mahasiswa 1========");
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
        System.out.println("========Mahasiswa 2========");
        mhs2.nim=102;
        mhs2.nama="Yunia";
        mhs2.alamat="Jl. Kelapa No 2G";
        mhs2.kelas="3G";
        mhs2.tampilBiodata();
        System.out.println("========Mahasiswa 3========");
        mhs3.nim=103;
        mhs3.nama="Budiman";
        mhs3.alamat="Jl. Rusa No 6A";
        mhs3.kelas="2A";
        mhs3.tampilBiodata();
    }
}
