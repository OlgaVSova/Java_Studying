import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class bubble {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("\\home\\olga\\Documents\\list.txt"));

        //System.out.println(Arrays.toString(numbers));
        int size = 10;
        int[] numbers = new int[10];
        int i;
        for (i = 0; input.hasNext(); i++){
            if (i == numbers.length) {
                int[] newNumbers = new int[numbers.length * 2];
                // copy from the old small table to the new large one
                System.arraycopy(numbers, 0, newNumbers, 0, i);
                numbers = newNumbers;
                System.out.println(Arrays.toString(numbers));
            }
            numbers[i] = input.nextInt();
        }

        int counter = 0;
        while (counter < numbers.length) {
            for (i = 0; i < numbers.length-1; ++i) {
                if (numbers[i] > numbers[i + 1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    //System.out.println(Arrays.toString(numbers));
                } else {
                    counter++;
                    //System.out.println(counter);
                }
            }
            if (counter < numbers.length-1){
                counter = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
