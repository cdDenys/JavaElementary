package Entity;

public class User extends MotherUser {

    public User(String name, String lastname, int age, String mail, String login, String password, String role) {
        super(name, lastname, age, mail, login, password, role);
    }

    @Override
    public boolean isAdmin() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
