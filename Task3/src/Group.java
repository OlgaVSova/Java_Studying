import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Group {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File ("C:\\Users\\ovasilev\\Documents\\users.txt"));
                //"home/olga/Documents/passengers.txt"));

        TreeSet<User> users = new TreeSet<>();
        for(; input.hasNext();){
            User newUser = new User;
            newUser.firstName = input.next();
            if(users.contains(newUser)){

            }
    }
}



class User{
    String firstName;
    ArrayList<String> secondNames = new ArrayList<>();



    @Override
    public String toString() {
        return firstName +" "+ secondNames;
    }
    public boolean equals(User obj){
        return this.firstName == obj.firstName;


    }
}

//class UserList{
//    String firstName;
//    String[] secondName;
//}

//использовать дерево с отсортированным arrayList на листках
//TreeSet + ArrayList ? Чтобы находить по имени всех пользователей
// или ArrayList + ArrayList, где каждый нечётный элемент - имя, нечётный - массив фамилий