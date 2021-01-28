import Entity.Admin;
import Entity.MotherUser;
import Entity.User;
import Services.AdminService;
import Services.UserService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        MotherUser user = new User("Vasia", "Pupkin", 45,
                "user@mail.com", "qwerty", "asdfg");
        MotherUser admin = new Admin("Alex", "Collins", 50,
                "admin@mail.com", "qwerty", "asdfg");
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Chose the option:" + "\n" +
                    "1 - Check user" + "\n" +
                    "2 - Write user" + "\n" +
                    "3 - exit");
            int num = scan.nextInt();
            if (num == 1) {
                new AdminService().isExist(admin);
                new UserService().isExist(user);
            } else if (num == 2) {
                new UserService().writeLog(user);
                new UserService().writeLog(admin);
                new AdminService().writeLog(admin);
                new AdminService().writeLog(user);
            } else if (num == 3) {
                break;
            } else {
                System.out.println("Chose from 1 to 3");
            }
        }


    }
}
