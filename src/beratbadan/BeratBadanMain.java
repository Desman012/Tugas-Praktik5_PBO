package beratbadan;
import java.util.Scanner;
public class BeratBadanMain {
    public static void main(String[] args) {
        float beratbadan, tinggibadan;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Tinggi Badan(m)\t: ");
        tinggibadan = sc.nextFloat();
        System.out.print("Berat Badan(kg)\t: ");
        beratbadan = sc.nextFloat();
        BeratBadan bb = new BeratBadan(beratbadan,tinggibadan);
        bb.Output();
    }
}
