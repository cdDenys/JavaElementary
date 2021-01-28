package Entity;

public class Admin extends MotherUser{


    public Admin(String name, String lastname, int age, String mail, String login, String password) {
        super(name, lastname, age, mail, login, password);
        setRole("ADMIN");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
