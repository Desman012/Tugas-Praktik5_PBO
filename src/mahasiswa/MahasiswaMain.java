package mahasiswa;
import java.util.*;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String npm, nama;
        float kehadiran, tugas, uts, uas;
        System.out.print("NPM\t\t: ");
        npm = sc.nextLine();
        System.out.print("Nama Mahasiswa\t: ");
        nama = sc.nextLine();
        System.out.print("NilaiKehadiran\t: ");
        kehadiran = sc.nextInt();
        System.out.print("NilaiTugas\t: ");
        tugas = sc.nextFloat();
        System.out.print("Nilai UTS\t: ");
        uts = sc.nextFloat();
        System.out.print("Nilai UAS\t: ");
        uas = sc.nextFloat();
        Mahasiswa m1 = new Mahasiswa(npm,nama,kehadiran,tugas,uts,uas);
        m1.Output();
    }    
}
