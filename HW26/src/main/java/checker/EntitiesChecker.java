package checker;

import exeption.EmptyDataBaseExeption;
import service.AccountService;
import service.ClientService;
import service.StatusService;

public class EntitiesChecker {
    ClientService clientService = new ClientService();
    AccountService accountService = new AccountService();
    StatusService statusService = new StatusService();

    public boolean clientDataIsNotEmpty(long id) throws EmptyDataBaseExeption {
        if (clientService.findById(id).getEmail() == null){
            throw new EmptyDataBaseExeption();
        }else {
            return true;
        }
    }
    public boolean accountDataIsNotEmpty(long id) throws EmptyDataBaseExeption {
        if (accountService.findById(id).getNumber() == null){
            throw new EmptyDataBaseExeption();
        }else {
            return true;
        }
    }
    public boolean statusDataIsNotEmpty(long id) throws EmptyDataBaseExeption {
        if (statusService.findById(id).getAlias() == null){
            throw new EmptyDataBaseExeption();
        }else {
            return true;
        }
    }
}

