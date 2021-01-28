package Services;

import Entity.MotherUser;

import java.io.IOException;

public interface AdminPanel {
    boolean isAdmin();
    void getLog(MotherUser usr) throws IOException, Exception;
}
