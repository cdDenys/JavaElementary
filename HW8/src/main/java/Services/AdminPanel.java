package Services;

import Entity.MotherUser;
import java.io.FileReader;
import java.util.Scanner;

public interface AdminPanel {
    void writeLog(MotherUser usr) throws Exception;

    default void isExist(MotherUser motherUser) throws Exception {
        FileReader fileReader = new FileReader("C:\\Users\\denis\\Desktop\\Hillel\\Elementary\\src\\main\\java\\data");
        Scanner scan = new Scanner(fileReader);
        boolean check = false;
        while (scan.hasNextLine()) {
            if (motherUser.getMail().equals(scan.nextLine())) {
                 check = true;
            }
        }
        fileReader.close();
        System.out.println(check);
        System.out.println(motherUser.getMail());
    }

}
