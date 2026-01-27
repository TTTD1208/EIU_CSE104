import java.util.Scanner;

public class EIVCHR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double discount = 0.3;
        long finalPrice = 0;
        long totalDiscount = (long) (n * discount);
        if (totalDiscount > 50000) {
            finalPrice = n - 50000;
        } else {
            finalPrice = n - totalDiscount;
        }
        System.out.print(finalPrice);
    }
}
