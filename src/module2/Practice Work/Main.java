import java.util.List;
import java.util.ArrayList;

class Usermanager {

    public List<User> userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }

    public void removeUser(User user){
        userList.remove(user);
    }

    public void updateUser(User user, String name, String email, String role){
        user.name = name;
        user.email = email;
        user.role = role;
    }
}

class User {

    public String name;
    public String email;
    public String role;

    public User(String name, String email, String role){
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public void updateName(String name){
        this.name = name;
    }

    public void updateEmail(String email){
        this.email = email;
    }

    public void updateRole(String role){
        this.role = role;
    }

    public String toString(){
        return name + " " + email + " " + role;
    }
}

public class Main {

    public static void main(String[] args){

        Usermanager users = new Usermanager();

        User user1 = new User("test1", "alex@mail.com", "Admin");
        User user2 = new User("test12", "adfs@mail.com", "User");

        users.addUser(user1);
        users.addUser(user2);

        System.out.println(users.userList.size());

        user1.updateEmail("new@mail.com");

        users.updateUser(user2, "testik", "afds2@mail.com", "Admin");

        System.out.println(user1.toString());
        System.out.println(user2.toString());

        users.removeUser(user2);

        System.out.println(users.userList.size());
    }
}
