import java.util.Scanner;

public class EIUBALANCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] salary = new long[n * 2 + 1];
        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextLong();
        }
        double[] spentEachMonth = new double[2 * n + 1];
        spentEachMonth[0] = sc.nextDouble();
        double r = sc.nextDouble() / 100 / 12;
        double f = sc.nextDouble() / 100 / 12;
        for (int i = 1; i <= 2 * n - 1; i++) {
            spentEachMonth[i] = spentEachMonth[i - 1] * (1 + f);
        }
        double[] investEachMonth = new double[2 * n + 1];
        investEachMonth[0] = salary[0] - spentEachMonth[0];
        for (int i = 1; i <= 2 * n; i++) {
            investEachMonth[i] = investEachMonth[i - 1] * (1 + r) + salary[i] - spentEachMonth[i];
        }
        long result = 0;
        if (investEachMonth[2 * n] > 0) {
            result = Math.round(investEachMonth[2 * n]);
        }

        System.out.println(result);
    }
}
