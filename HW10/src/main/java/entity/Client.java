package entity;

public class Client {
    private String id;
    private String lastName;
    private String idAccount;
    private double sum;

    public Client(String id, String lastName, String idAccount, double sum) {
        this.id = id;
        this.lastName = lastName;
        this.idAccount = idAccount;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idAccount='" + idAccount + '\'' +
                '}';
    }
}
