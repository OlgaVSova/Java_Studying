import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int c1 = input.nextInt();

        int a2 = input.nextInt();
        int b2 = input.nextInt();
        int c2 = input.nextInt();

        if (a1 == b1 && b1 == c1 && a2 == b2 && b2 == c2) {
            if (a1 > a2) {
                System.out.println("Box 1 > Box 2");
            } else if (a1 < a2){
                System.out.println("Box 1 < Box 2");
            } else {
                System.out.println("Box 1 = Box 2");
            }
        } else {

            int sMax1 = Math.max(Math.max(a1, b1), c1);
            int sMin1 = Math.min(Math.min(a1, b1), c1);
            int sMid1 = a1 + b1 + c1 - sMax1 - sMin1;

            int sMax2 = Math.max(Math.max(a2, b2), c2);
            int sMin2 = Math.min(Math.min(a2, b2), c2);
            int sMid2 = a2 + b2 + c2 - sMax2 - sMin2;

            if (sMax1 == sMax2 && sMin1 == sMin2 && sMid1 == sMid2) {
                System.out.println("Box 1 = Box 2");
            } else if (sMax1 * sMin1 >= sMax2 * sMin2 && sMax1 >= sMax2 && sMin1 >= sMin2) {
                if (sMid1 >= sMid2) {
                    System.out.println("Box 1 > Box 2");
                } else {
                    System.out.println("Incomparable");
                }
            } else if (sMax1 * sMin1 <= sMax2 * sMin2 && sMax1 <= sMax2 && sMin1 <= sMin2) {
                if (sMid1 <= sMid2) {
                    System.out.println("Box 1 < Box 2");
                } else {
                    System.out.println("Incomparable");
                }
            } else {
                System.out.println("Incomparable");
            }
        }
    }
}

