import java.util.Scanner;

public class Problem8 {
    static public void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the 4 digit number:");
        int number = input.nextInt();
        int sum = 0;
        while(number > 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.print(sum);
        input.close();
    }
}
