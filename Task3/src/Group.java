import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class Group {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File ("C:\\Users\\ovasilev\\Documents\\users.txt"));
                //"home/olga/Documents/passengers.txt"));

//        int size = 10;
//        User[] users = new User[size];
//        int i;
//        for (i = 0; input.hasNext(); i++){
//            User newUser = new User();
//            newUser.firstName = input.next();
//            newUser.secondName = input.next();
//            if (i == size) {
//                User[] newUsers = new User[size * 2];
//                // copy from the old small table to the new large one
//                System.arraycopy(users, 0, newUsers, 0, i);
//                users = newUsers;
//            }
//            users[i] = newUser;
//        }
//        System.out.println(Arrays.toString(users));
//        System.out.println(users[1]);

//        int i;
//        for (i = 0; input.hasNext(); i++){
//            User newUser = new User();
//            newUser.firstName = input.next();
//
//            HashSet userNames = new newUser.firstName();
// }

        HashSet<User> users = new HashSet<>();
        int i;
        for (i = 0; input.hasNext(); i++){
            User newUser = new User();
//            newUser.firstName = input.next();
//            newUser.secondName = input.next();


         }




    }
}

class User{
    String firstName;
    String[] secondNames;

    @Override
    public String toString() {
        return "Mr/Mrs " + firstName +" "+ secondNames;
    }
}

//class UserList{
//    String firstName;
//    String[] secondName;
//}

//использовать дерево с отсортированным arrayList на листках
//TreeSet + ArrayList ? Чтобы находить по имени всех пользователей
// или ArrayList + ArrayList, где каждый нечётный элемент - имя, нечётный - массив фамилий