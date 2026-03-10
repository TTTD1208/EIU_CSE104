import java.util.Scanner;

public class caculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 1;
        while (n != 0) {
            System.out.print("Nhap v'1: ");
            double v1 = sc.nextDouble();
            System.out.print("nhap m1: ");
            double m1 = sc.nextDouble();
            System.out.print("nhap m2: ");
            double m2 = sc.nextDouble();
            // tinh p1
            double p1 = m1 * v1;
            // tinh p2
            double p2 = m2 * v1;
            // tinh E1
            double E1 = Math.pow(p1, 2) / (2 * m1);
            //tinh E2
            double E2 = Math.pow(p2, 2) / (2 * m2);
            double E = E1 + E2;
            System.out.println(E);
            n = sc.nextDouble();
        }

    }
}