package Entity;

public class Admin extends MotherUser{

    public Admin(String name, String lastname, int age, String mail, String login, String password, String role) {
        super(name, lastname, age, mail, login, password, role);
    }

    @Override
    public boolean isAdmin() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
