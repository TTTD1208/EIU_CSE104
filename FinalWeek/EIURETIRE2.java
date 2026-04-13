import java.util.Scanner;

public class EIURETIRE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double r = sc.nextDouble() / 100 / 12;
        double f = sc.nextDouble() / 100 / 12;
        long[] income = new long[n + 1];
        double[] invest = new double[n + 1];
        double[] spendEachMonth = new double[n + 1];

        double min = 0;
        double max = Long.MAX_VALUE;
        for (int i = 0; i < income.length - 1; i++) {
            income[i] = sc.nextLong();
        }
        while (max - min > Math.pow(10, -6)) {
            spendEachMonth[0] = (max + min) / 2;
            // tinh so tien tiet kiem hang thang
            invest[0] = income[0] - spendEachMonth[0];
            for (int j = 1; j <= spendEachMonth.length - 1; j++) {
                spendEachMonth[j] = spendEachMonth[j - 1] * (1 + f);
            }
            for (int j = 1; j <= n; j++) {
                invest[j] = invest[j - 1] * (1 + r) + income[j] - spendEachMonth[j];
            }
            if (invest[n + 1]>0) {
                max = spendEachMonth[n];
            } else {
                min = spendEachMonth[n];
            }
        }
        double result = (max + min) / 2;
        System.out.println(result);
    }
}