import java.util.Scanner;
public class SumNumbers {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of two numbers: "+sum);
    }
}
