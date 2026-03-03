import java.util.Scanner;

public class EIUPURCHASE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long stuffValue = sc.nextLong();
        int month = sc.nextInt();
        long n = sc.nextLong();
        long m = sc.nextLong();
        double high = 1;
        double low = 0;
        long dept = stuffValue - n;
        while ((high - low) > (1 * Math.pow(10, -7))) {
            double mid = (high + low) / 2;
            double remain1 = dept * Math.pow((1 + mid), month);
            double remain2 = m * ((Math.pow((1 + mid), month) - 1) / ((1 + mid) - 1));
            double remain = remain1 - remain2;
            if (remain > 0) {
                high = mid;
            } else {
                low = mid;
            }
        }
        double result = (high + low) / 2;
        double round = (double)(Math.round(result*1000))/(1000);
        System.out.println(round);
    }
}
