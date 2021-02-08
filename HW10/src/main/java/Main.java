import entity.Client;
import exception.WrongFieldException;
import exception.WrongSumException;
import service.TransactionService;
import util.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client sender = new Client("1234567890", "Smith", "1234567890", 0);
        Client recipient = new Client("0987654321", "Collin", "0987654321", 0);

        Scanner scan = new Scanner(System.in);
        boolean isCheck = true;
        String senderIdAccount;
        do {
            System.out.println("Enter sender idAccount:");
            senderIdAccount = scan.nextLine();
            try {
                Helper.checkID(senderIdAccount);
                isCheck = false;
            } catch (WrongFieldException e) {
                System.out.println("Please correct sender idAccount");
            }

        } while (isCheck);

        isCheck = true;
        String recipientIdAccount;
        do {
            System.out.println("Enter recipient idAccount:");
            recipientIdAccount = scan.next();
            try {
                Helper.checkID(recipientIdAccount);
                isCheck = false;
            } catch (WrongFieldException e) {
                System.out.println("Please correct recipient idAccount");
            }
        } while (isCheck);

        isCheck = true;
        double amount;
        do {
            System.out.println("Enter sum");
            amount = scan.nextDouble();
            try {
                Helper.checkSum(amount);
                isCheck = false;
            } catch (WrongSumException e) {
                System.out.println("Please correct sum");
            }
        } while (isCheck);

        TransactionService.moneyTransfer(recipient, recipientIdAccount);
        System.out.println("---------------------");
        System.out.println("Sender " + sender.toString());
        System.out.println("---------------------");
        System.out.println("Recipient " + recipient.toString());
    }
}



