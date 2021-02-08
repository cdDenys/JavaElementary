package service;

import entity.Client;
import util.Helper;

public class TransactionService {
    public static void moneyTransfer(Client client, String idAccount){
        Helper.compareID(client.getId(), idAccount);
        System.out.println("DONE!");
        System.out.println("Recipient id: " + client.getIdAccount());
    }
}
