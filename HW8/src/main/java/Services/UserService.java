package Services;

import Entity.MotherUser;

public class UserService implements AdminPanel {

    public UserService() {
    }

    @Override
    public void writeLog(MotherUser usr) {
        System.out.println("Not available for user");
    }

}
