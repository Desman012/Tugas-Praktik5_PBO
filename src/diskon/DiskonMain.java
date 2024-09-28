package diskon;
import java.util.Scanner;
public class DiskonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;
        System.out.print("Total pembelian Rp. = ");
        total = sc.nextInt();
        Diskon ds = new Diskon(total);
        ds.Output();
    }
}
