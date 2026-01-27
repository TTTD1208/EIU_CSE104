import java.util.Scanner;

public class EIUPASSBOOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n = sc.nextInt();
        int m = sc.nextInt();
        double r1 = sc.nextDouble() / 100;
        double r2 = sc.nextDouble() / 100;
        int year = (n - m) / 12;
        double y = (x * (1 + r1 * (n / 12d)) / Math.pow(1 + r2, year) / (1 + r2 * ((n - m) % 12) / 12));
        long result = Math.max(x, (long) y);
        result = Math.round(result);
        System.out.print(result);
    }
}
