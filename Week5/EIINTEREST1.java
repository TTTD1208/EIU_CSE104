import java.util.Scanner;

public class EIINTEREST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        long[] m = new long[12];
        long total = 0;

        for (int i = 0; i < 12; i++) {
            m[i] = sc.nextLong();
        }
        double finalAmount = 0;
        for (int i = 11; i >= 0; i--) {
            finalAmount += m[11 - i] * Math.pow(1 + x, i + 1);
        }
        total = Math.round(finalAmount);
        System.out.print(total);

    }
}
