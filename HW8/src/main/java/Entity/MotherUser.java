package Entity;

public abstract class MotherUser {
    private String name;
    private String lastname;
    private int age;
    private String mail;
    private String login;
    private String password;
    private String role;

    public MotherUser(String name, String lastname, int age, String mail, String login, String password) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mail = mail;
        this.login = login;
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return
                name + '\n' +
                        lastname + '\n' +
                        age + '\n' +
                        mail + '\n' +
                        login + '\n' +
                        password + '\n' +
                       "Role is: " + role + "\n" + "\n";
    }

}
