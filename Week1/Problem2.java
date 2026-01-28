import java.util.Scanner;

public class Problem2 {
    static public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name please !!!");
        String name = input.nextLine();
        System.out.println("Hello"+name);
        input.close();
    }
}
