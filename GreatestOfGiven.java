import java.util.Scanner;

public class GreatestOfGiven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = in.nextInt();
        System.out.print("Enter value for b: ");
        int b = in.nextInt();
        System.out.print("Enter value for c: ");
        int c = in.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("The greatest number is " + max);
    }
}
