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
    public String getLog() throws Exception {
        FileWriter fw = new FileWriter("C:\\Users\\denis\\Desktop\\Hillel\\Elementary\\src\\main\\java\\log.txt");
        return null;
    }

}
