import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class bubble {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("\\home\\olga\\Documents\\list.txt"));
                //"C:\\Users\\ovasilev\\Documents\\numbers.txt"));

        int size = 10;
        int[] numbers = new int[size];
        int i;
        for (i = 0; input.hasNext(); i++){
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int counter = 0;
        System.out.println(size);
        while (counter < size-1) {
            for (i = 0; i < size - 1; ++i) {
                if (numbers[i] > numbers[i + 1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    System.out.println(Arrays.toString(numbers));
                } else {
                    counter++;
                    System.out.println(counter);
                }
            }
            if (counter < size -1){
                counter = 0;
            }
        }

    }
}
