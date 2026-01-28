import java.util.Scanner;

public class Problem4 {
    static public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = input.nextDouble();
        System.out.println("Enter the length: ");
        double l = input.nextDouble();
        System.out.printf("Volume = %.2f\nArea= %.4f",r*r*Math.PI*l,Math.PI*r*r);
        input.close();
    }
}
