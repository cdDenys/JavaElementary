package Services;

import java.io.IOException;

public interface AdminPanel {
    boolean isAdmin();
    String getLog() throws IOException, Exception;
}
