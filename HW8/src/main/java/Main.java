import Entity.Admin;
import Entity.MotherUser;
import Entity.User;
import Services.AdminService;
import Services.UserService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static MotherUser motherUser;

    public static void main(String[] args) throws Exception {
//        FileReader fr = new FileReader("C:\\Users\\denis\\Desktop\\Hillel\\Elementary\\src\\main\\java\\users.txt");
//        Scanner scan = new Scanner(fr);
//        String user = "";
//        while (scan.hasNextLine()) {
//            user = scan.nextLine();
//            System.out.println(user);
//        }
//        fr.close();

        MotherUser user1 = new Admin("alex", "smith", 45, "asd@mail.com", "adm", "adm", "ADMIN");
        AdminService service = new AdminService();
        UserService userService = new UserService();
        service.getLog(user1);

        MotherUser user2 = new User("alex", "smith", 45, "asd@mail.com", "adm", "adm", "USER");
        service.getLog(user2);
        userService.getLog(user2);

    }
}
