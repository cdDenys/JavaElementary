import java.util.*;

public class Information {
    private ArrayList<String> pseudonyms = new ArrayList<>();
    private Set<String> mails = new HashSet<>();
    private Map<String, String> users = new HashMap<>();

    public ArrayList<String> getPseudonyms() {
        return pseudonyms;
    }

    public Set<String> getMails() {
        return mails;
    }

    public Map<String, String> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Information{" +
                "users=" + users +
                '}';
    }
}
