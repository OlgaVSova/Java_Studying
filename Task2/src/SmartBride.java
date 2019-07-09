import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class SmartBride {
    public static void main(String[] args){
        Scanner input = new Scanner(new File("\\home\\olga\\Documents\\list.txt"));

        int size = 10;
        Groom[] numbers = new Groom[size];
        int i;
        for (i = 0; input.hasNext(); i++){
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


    }


}

class Groom{
    int place;
    String surname;
    int IQ;

    @Override
    public String toString() { return "Groom{"place + "." + surname + "IQ = " + IQ"}"; }
}


