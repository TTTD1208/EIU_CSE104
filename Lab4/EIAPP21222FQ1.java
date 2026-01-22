import java.util.Scanner;

public class EIAPP21222FQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double M = sc.nextDouble();
        double money = N;
        double[] rate = new double[] {
                0.0390 / 12, 0.0392 / 12, 0.0395 / 12, 0.0399 / 12, 0.0404 / 12, 0.0554 / 12, 0.0572 / 12, 0.0592 / 12,
                0.0614 / 12, 0.0638 / 12, 0.0664 / 12, 0.0692 / 12
        };
        while (M != 0) {
            if (M > 12) {
                money = money * (1 + rate[11]*12);
                M -= 12;
            } else {
                money = money * Math.pow((1 + rate[(int) M - 1]), M);
                M = 0;
            }
        }
        System.out.println(Math.round(money));
    }
}
