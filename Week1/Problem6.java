import java.util.Scanner;

public class Problem6 {
    static public void main(){
        final double TAX_PERCENT = 0.12;
        final double TIP_PERCENT = 0.12;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of meal you ate: ");
        double price = input.nextDouble();
        double tax = price*TAX_PERCENT;
        double tip = price*TIP_PERCENT;
        System.out.printf("Tax: %.2f \nTip: %.2f \nGrand Total: %.2f",tax,tip,tax+tip+price);
        input.close();
    }
}
