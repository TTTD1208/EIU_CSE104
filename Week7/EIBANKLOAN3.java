import java.util.Scanner;

public class EIBANKLOAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        long[] dongTien = new long[t + 1];
        for (int i = 0; i < n; i++) {
            int date = sc.nextInt();
            long amount = sc.nextLong();
            dongTien[date] += amount;
        }
        int thang = t / 30;
        double soDu = 0;
        double tienNo = 0;
        double tongLai = 0;
        int soNgayChotNo = 0;
        int ngayBatDauTinhNo = 1;
        while (thang != 0) {
            soNgayChotNo += 30;

            for (int j = ngayBatDauTinhNo; j <= soNgayChotNo; j++) {
                soDu += dongTien[j];
                if (dongTien[j] < 0) {
                    tienNo += dongTien[j];
                }
                if (j == soNgayChotNo) {
                    tongLai = tienNo / 30 * r;

                }
            }
            ngayBatDauTinhNo += 30;
            thang--;

        }
        long conLai = Math.round(tongLai + soDu);

        System.out.println(conLai);
    }
}
