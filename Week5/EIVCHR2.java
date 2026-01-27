

import java.util.Arrays;
import java.util.Scanner;

public class EIVCHR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matHang = sc.nextInt();
        long[] giaTri = new long[matHang];
        for (int i = 0; i < matHang; i++) {
            giaTri[i] = sc.nextLong();
        }
        Arrays.sort(giaTri);

        long totalDiscount = (long) (giaTri[matHang-1] * 0.3);
        if (totalDiscount > 50000) {
            giaTri[matHang-1] = giaTri[matHang-1] - 50000;
        } else {
            giaTri[matHang-1] = giaTri[matHang-1] - totalDiscount;
        }
        long finalPrice = 0;
        for (int i = 0; i < matHang; i++) {
            finalPrice += giaTri[i];
        }
        System.out.print(finalPrice);
    }
    
}
