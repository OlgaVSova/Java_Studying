import java.util.Scanner;

public class Minimum {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Max laptop price");
        int maxPrice = input.nextInt();

        Laptop theBestSoFar = next();

        do {
            System.out.println("More? true/false");
            boolean more = input.nextBoolean();
            if (!more) {
                break;  //return выходит из метода на любой глубине
            }

            Laptop candidate = next();
            if (candidate.price > maxPrice) {
                continue;
            }

            if (candidate.weight < theBestSoFar.weight) {
                theBestSoFar = candidate;
            }
        } while (true);

        System.out.println("The best:");
        System.out.println("Weight" + theBestSoFar.weight);
        System.out.println("Price" + theBestSoFar.price);
    }

    public static Laptop next() {
        System.out.println("Enter weight:");
        int weight = input.nextInt();
        System.out.println("Enter price:");
        int price = input.nextInt();

        Laptop newLaptop = new Laptop(); //обязательны () при использовании new
        newLaptop.weight = weight;
        newLaptop.price = price;

        if (newLaptop.weight < 0) {
            System.out.println("Wrong data");
        }
        return newLaptop;
    }
}

class Laptop {
    int weight;
    int price;
}



