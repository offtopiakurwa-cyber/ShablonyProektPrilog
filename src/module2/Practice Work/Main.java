import java.util.List;
import java.util.ArrayList;

class Usermanager{
     public final List<User> userList = new ArrayList<>();

     public void addUser(User user){
        userList.add(user);
     }
     public void removeUser(User user){
        userList.remove(user);
     }
    }


class User{
    public int id;
    public String role;
    public String email;

    public User(int id, String role, String email){
      this.id = id;
      this.role = role;
      this.email = email;
    }
    public void updateUserID(int id){
        this.id = id;
    }
    public void updateUserEmail(String email){
        this.email = email;
    }


    public String toString(){
      return email + " " + role + " " + id;
    }
}

public class Main{
    public static void main(String[] args){
      Usermanager users = new Usermanager();
      User user1 = new User(1, "Admin", "1234mail.com");
      users.addUser(user1);
      user1.updateUserEmail("EmailUpdatedEmail");
      System.out.println(user1.toString());
      User user2 = new User(1, "Admin", "123mail.com");
      users.addUser(user2);
      System.out.println(users.userList.size());
      user2.updateUserID(0);
      users.removeUser(user2);
      System.out.println(users.userList.size());
    }
}
