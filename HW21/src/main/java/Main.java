import entity.Accounts;
import entity.Clients;
import entity.Statuses;
import service.AccountService;
import service.ClientService;
import service.StatusService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clients client = new Clients();
//-----------------INSERT-----------------
//        client.setName("Test");
//        client.setEmail("test@gmail.com");
//        client.setPhone(380678839L);
//        client.setAbout("testtesttest");
//        ClientService.save(client);
//-----------------UPDATE-----------------
//        client.setName("New test");
//        client.setId(14);
//        ClientService.update(client);
// -----------------DELETE-----------------
//        client.setId(14);
//        ClientService.delete(client);
// -----------------FIND_BY_PHONE-----------------
//        System.out.println(ClientService.findByPhone(380958089093L));
        Statuses status = new Statuses();
//-----------------INSERT-----------------
//        status.setAlias("NEW TEST TEST TEST");
//        status.setDescription("TEST");
//        StatusService.save(status);
//-----------------UPDATE-----------------
//        status.setAlias("NEW TEST TEST TEST");
//        status.setDescription("TEST");
//        status.setId(5);
//        StatusService.update(status);
// -----------------DELETE-----------------
//        status.setId(5);
//        StatusService.delete(status);


        Accounts account = new Accounts();
//-----------------INSERT-----------------
//        account.setClient_id(2);
//        account.setNumber("UATESTTEST");
//        account.setValue(2021.20);
//        AccountService.save(account);
//-----------------UPDATE-----------------
//        account.setClient_id(3);
//        account.setNumber("UA ANOTHER");
//        account.setValue(100000);
//        account.setId(12);
//        AccountService.update(account);
// -----------------DELETE-----------------
//        account.setId(12);
//        AccountService.delete(account);
//        System.out.println(AccountService.getAll());


//-------------------------------------------------------------

        System.out.println(StatusService.getClientAndStatus());
        System.out.println(AccountService.findByValue(200));
        System.out.println(AccountService.getClientByIdMatch());
        System.out.println(StatusService.getClientAndStatus());


    }
}
