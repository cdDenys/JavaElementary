package util;

import exception.UserExpectedError;
import exception.WrongFieldException;
import exception.WrongSumException;

public class Helper {

    public static void checkID(String id) throws WrongFieldException {
        if (id.length() != 10) {
            throw new WrongFieldException();
        }
    }

    public static void checkSum(double sum) throws WrongSumException {
        if (sum > 1000) {
            throw new WrongSumException();
        }
    }

    public static void compareID(String id, String idAccount) throws UserExpectedError {
        if (!id.equals(idAccount)) {
            throw new UserExpectedError();
        }
    }
}
