package Services;

import Entity.Admin;
import Entity.MotherUser;

import java.io.FileWriter;
import java.io.IOException;

public class AdminService implements AdminPanel {
    @Override
    public boolean isAdmin() {
        return true;
    }

    @Override
    public void getLog(MotherUser usr) throws Exception {
        FileWriter fw = new FileWriter("C:\\Users\\denis\\Desktop\\Hillel\\Elementary\\src\\main\\java\\log.txt", true);
        fw.write(usr.toString());
        fw.close();
        System.out.println(usr.toString());
    }

}
