import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SmartBride {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("C:\\Users\\ovasilev\\Documents\\grooms.txt"));

        Groom[] grooms = new Groom[10];
        int i;
        for (i = 0; input.hasNext(); i++){
            Groom newGroom = new Groom();
            newGroom.surname = input.next();
            newGroom.IQ = input.nextInt();

            grooms[i] = newGroom;
        }
        //System.out.println(Arrays.toString(grooms));


        int counter = 0, top = 3;
        while (counter < top) {
            for (i = 0; i < grooms.length-1; ++i) {
                if (grooms[i].IQ > grooms[i + 1].IQ) {
                    Groom tmp = grooms[i];
                    grooms[i] = grooms[i + 1];
                    grooms[i + 1] = tmp;
                    //System.out.println(Arrays.toString(grooms));
                }
            }
            counter++;
        }
        for(i = grooms.length-1; i >= grooms.length - top; i--){
            int n = grooms.length - i;
            grooms[i].place = n;
            System.out.println(grooms[i]);
        }
        //System.out.println(Arrays.toString(grooms));
    }
}

class Groom {
    int place;
    String surname;
    int IQ;

    @Override
    public String toString() {
        return place+". " + surname + " IQ: " + IQ;
    }
}