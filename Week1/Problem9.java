import java.util.Scanner;

public class Problem9 {
    static public void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter first number:");
        int n1 = input.nextInt();
        System.out.print("\nEnter the second number:");
        int n2 = input.nextInt();
        System.out.print("\nEnter the third number:");
        int n3 = input.nextInt();
        int sum = n1+n2+n3;
        int min = n1;
        min = Math.min(min,n2);
        min = Math.min(min,n3);
        int max = n1;
        max = Math.max(max,n2);
        max = Math.max(max,n3);
        int middle = sum - max - min;
        System.out.print(min+" "+middle+" "+max);
        input.close();
    }
}
