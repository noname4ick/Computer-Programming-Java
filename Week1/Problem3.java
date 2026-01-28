import java.util.Scanner;

public class Problem3 {
    static public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height: ");
        double height = input.nextDouble();
        System.out.println("Enter the width: ");
        double width = input.nextDouble();
        System.out.printf("Area = %.2f\nPerimeter = %.2f",height*width,2*(width+height));
        input.close();
    }
}
