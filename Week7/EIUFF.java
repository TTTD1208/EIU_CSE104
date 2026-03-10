import java.util.Scanner;

public class EIUFF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble()/100;
        double f = sc.nextDouble()/100;
        double y = sc.nextDouble();
        double n = sc.nextDouble();
        double t = (1+f)/(1+r);
        double x1 = y/(1+r);
        double x2 = (Math.pow(t, n-1)-1)/(t-1);
        double x = x1 * x2;
        double result = (double)Math.round(x*10000)/10000;
        System.out.println(result);
    }
}