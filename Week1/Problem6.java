import java.util.Scanner;

public class Problem6 {
    static public void main(){
        double PI = 3.1415;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of meal you ate: ");
        double price = input.nextDouble();
        double tax = price*0.12;
        double tip = price*0.18;
        System.out.printf("Tax: %.2f \nTip: %.2f \nGrand Total: %.2f",tax,tip,tax+tip+price);
        input.close();
    }
}
