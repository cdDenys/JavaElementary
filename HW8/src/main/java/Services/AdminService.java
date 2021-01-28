package Services;

import Entity.MotherUser;
import java.io.FileWriter;

public class AdminService implements AdminPanel {
    public AdminService() {
    }

    @Override
    public void writeLog(MotherUser user) throws Exception {
        FileWriter fw = new FileWriter("C:\\Users\\denis\\Desktop\\Hillel\\Elementary\\src\\main\\java\\log.txt", true);
        fw.write(user.toString());
        fw.close();
        System.out.println("Done, check 'log.txt'");
    }
}
