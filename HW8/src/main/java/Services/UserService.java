package Services;

import Entity.MotherUser;

import java.io.FileWriter;

public class UserService implements AdminPanel {
    @Override
    public boolean isAdmin() {
        return false;
    }

    @Override
    public void getLog(MotherUser usr) {
        System.out.println("Not available for user");
    }
}
