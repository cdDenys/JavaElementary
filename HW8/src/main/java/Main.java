import Entity.Admin;
import Entity.MotherUser;
import Entity.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
//        FileReader fr = new FileReader("C:\\Users\\denis\\Desktop\\Hillel\\Elementary\\src\\main\\java\\users.txt");
//        Scanner scan = new Scanner(fr);
//        String user = "";
//        while (scan.hasNextLine()) {
//            user = scan.nextLine();
//            System.out.println(user);
//        }
//        fr.close();
        MotherUser user = new Admin("alex", "smith", 45, "sd@mail.com", "admin", "pass", "ADMIN");
        System.out.println(user.toString());
        System.out.println(user.isAdmin());
        
    }
}
