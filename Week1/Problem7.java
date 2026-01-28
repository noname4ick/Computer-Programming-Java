import java.util.Scanner;

public class Problem7 {
    static public void main(){
        double PI = 3.1415;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the driving distance:");
        double distance = input.nextDouble();
        System.out.print("\nEnter the miles per gallon: ");
        double f_eff = input.nextDouble();
        System.out.print("\nEnter the price per gallon");
        double f_price = input.nextDouble();
        System.out.printf("\nThe cost of driving $%.2f", distance/(f_eff/f_price));
        input.close();
    }
}
