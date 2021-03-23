package service;

import dao.AccountDao;
import model.Account;

public class AccountService {

    AccountDao accountDao = new AccountDao();
    public void save(Account account) {
        accountDao.save(account);
    }

    public void delete(Account account) {
        accountDao.delete(account);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public Account findById(long id) {
        return accountDao.findById(id);
    }
}
