import java.util.Scanner;

public class EIBANKRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        long months = sc.nextLong();
        double rate = (9.0/12.0)/100.0;
        double output = money *(1+rate*months);
        System.out.println(output);
        sc.close();
    }
}
