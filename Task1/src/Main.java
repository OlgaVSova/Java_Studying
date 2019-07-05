import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float a, b, x;

        Scanner in = new Scanner(System.in);
        System.out.println("To solve the equation ax + b = 0 ");
        System.out.println("Input a ≠ 0: ");
        a = in.nextFloat();
        b = in.nextFloat();

        if (a != 0 ) {
            System.out.println("Input b: ");
            x = -b / a;
            System.out.println("Answer: " + x);
        } else if (b == 0) {
            System.out.println("x - any number");
        } else {
            System.out.println("Wrong equation");
        }
    }
}
