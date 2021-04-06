package service;

import model.Account;
import model.Client;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {
    private AccountService accountService = new AccountService();
    private Account account = new Account();

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach");
    }

    @Test
    void save() {
        account.setId(100);
        account.setNumber("UATEST2021");
        account.setValue(20.20);
        account.setClient_id(5);
        accountService.save(account);
        assertEquals(accountService.findById(100).getId(), 100);
    }

    @Test
    void findById() {
        assertEquals(accountService.findById(100).getId(), 100);
    }

    @Test
    void update() {
        account.setNumber("UAANOTHERTEST");
        accountService.update(account);
        assertEquals(accountService.findById(100).getNumber(), "UAANOTHERTEST");
    }

    @Test
    void delete() {
        accountService.delete(account);
        assertNull(accountService.findById(100));
    }

}