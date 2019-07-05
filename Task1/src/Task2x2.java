import java.util.Scanner;

public class Task2x2 {

    public static void main(String[] args) {

        float a, b, c;
        double x1, x2, D;

        Scanner in = new Scanner(System.in);
        System.out.println("To solve the equation \"ax^2 + bx + c = 0\" input a:");
        a = in.nextFloat();
        System.out.println("Input b: ");
        b = in.nextFloat();
        System.out.println("Input c: ");
        c = in.nextFloat();

        if (a == 0) {
            if (b != 0) {
                x1 = -c / b;
                System.out.println("Answer: " + x1);
            } else if (c == 0) {
                System.out.println("x - any number");
            } else {
                System.out.println("Wrong equation");
            }
        } else {
            D = Math.sqrt(Math.pow(b, 2) - 4*a*c);
            if (D < 0 || Double.isNaN(D)) {
                System.out.println("Корней нет");
            } else if (D == 0) {
                x1 = -b / (2 * a);
                System.out.println("Answer:" + x1);
            } else {
                x1 = (-b + D) / (2 * a);
                x2 = (-b - D) / (2 * a);
                System.out.println("Answer: \n"+x1+"\n"+x2);
            }
        }
    }
}

