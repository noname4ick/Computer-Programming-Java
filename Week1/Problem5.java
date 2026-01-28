import java.util.Scanner;

public class Problem5 {
    static public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double x = input.nextDouble();
        System.out.println("Enter the length: ");
        double l = input.nextDouble();
        double area = Math.sqrt(3)/4 * x*x;
        System.out.printf("Volume = %.2f\nArea= %.2f",area*l, area);
        input.close();
    }
}
