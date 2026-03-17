import java.util.Scanner;

public class EIUCARLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long p = sc.nextLong();
        long newP = sc.nextLong();
        double m = sc.nextDouble() / 100;
        long n = sc.nextLong();
        long k = sc.nextLong();
        double l = sc.nextDouble()/100;
        //tinh so tien no de mua xe moi sau khi dac coc m%
        double x = p * (1-m);

        double high = 0.5;
        double low = 0;
        double valueOfOldCarAfKMonth = p *0.9*Math.pow(1-l, k-1);
        double downPayOfNewCar = newP * m;
        double debt0 = valueOfOldCarAfKMonth - downPayOfNewCar;
        while (high-low>Math.pow(10, -6)) {
            double rate = (high+low)/2;
            double R = rate + 1;
            double g = x*Math.pow(R, n)/((Math.pow(R, n)-1)/(R-1));
            double remainingDebt = x*Math.pow(R, k-1) - g*(Math.pow(R, k-1)-1)/(R-1);
            if(remainingDebt > debt0){
                high = rate;
            } else{
                low = rate;
            }
        }
        double result = ((high+low)*6);
        result = (double)Math.round(result*10000)/10000;
        System.out.println(result);
    }
}
