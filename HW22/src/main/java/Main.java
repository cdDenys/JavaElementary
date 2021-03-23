import model.Account;
import model.Client;
import model.Status;
import org.hibernate.sql.Update;
import service.AccountService;
import service.ClientService;
import service.StatusService;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        ClientService clientService = new ClientService();
        AccountService accountService = new AccountService();
        StatusService statusService = new StatusService();
        //System.out.println(clientService.findByPhone(380958089093L));
//        Add client
        Client client1 = new Client();
//        client1.setName("Test");
//        client1.setEmail("test@mail.com");
//        client1.setPhone(3809999999L);
//        client1.setAbout("Good dev");
//        clientService.save(client1);

//        Update
//        client1.setAbout("Test");
//        client1.setEmail("another@mail.com");
//        client1.setName("Another Test");
//        clientService.update(client1);

//        Find by id
//        System.out.println(clientService.findById(16));
//        Find by phone
//        System.out.println(clientService.findByPhone(3809999999L));

//        Delete
//        clientService.delete(client1);

        Account account = new Account();
//        Add account
//        account.setClient_id(5);
//        account.setNumber("UATESTTESTTEST");
//        account.setValue(200.78);
//        accountService.save(account);
//        Update
//        account.setValue(209.33);
//        account.setClient_id(16);
//        account.setNumber("AnotherTest");
//        accountService.update(account);
//        Delete
//        accountService.delete(account);
//        Find by id
//        System.out.println(accountService.findById(13));
        Status status = new Status();
//        Add status
//        status.setAlias("Test");
//        status.setDescription("Test");
//        statusService.save(status);
//        Update
//        status.setId(5);
//        status.setAlias("Test2");
//        status.setDescription("Test2");
//        statusService.update(status);
//        Delete
//        statusService.delete(status);
//        Find by id
//        System.out.println(statusService.findById(5));


    }
}
