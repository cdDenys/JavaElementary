package Services;

import java.io.FileWriter;

public class UserService implements AdminPanel {
    @Override
    public boolean isAdmin() {
        return false;
    }

    @Override
    public String getLog() {
        return "Not available for user";
    }
}
