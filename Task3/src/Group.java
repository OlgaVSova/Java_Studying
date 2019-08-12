import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Group {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File ("C:\\Users\\ovasilev\\Documents\\users.txt"));
                //"home/olga/Documents/passengers.txt"));

    TreeSet<UserGroup> users = new TreeSet<>();
    for(; input.hasNext();) {
        UserGroup newUser = new UserGroup();
        newUser.firstName = input.next();
        String secondName = input.next();
            if (users.contains(newUser)) {
                //надо найти объект с таким же именем и вписать в него!
                //THATUser.secondNames.add(secondName);

            }
            else {
                users.add(newUser);
                newUser.secondNames.add(secondName);
            }
        }
        System.out.println(users );
    }
}


class UserGroup {
    String firstName;
    ArrayList<String> secondNames = new ArrayList<>();

    @Override
    public String toString() {
        return firstName +" "+ secondNames;
    }
    public boolean equals (UserGroup obj){
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