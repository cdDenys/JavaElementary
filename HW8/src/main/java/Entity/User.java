package Entity;

public class User extends MotherUser {


    public User(String name, String lastname, int age, String mail, String login, String password) {
        super(name, lastname, age, mail, login, password);
        setRole("USER");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
