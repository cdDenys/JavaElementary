package Entity;

public abstract class MotherUser {
    private String name;
    private String lastname;
    private int age;
    private String mail;
    private String login;
    private String password;
    private String role;

    public MotherUser(String name, String lastname, int age, String mail, String login, String password, String role) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mail = mail;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "MotherUser{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public abstract boolean isAdmin();
}
