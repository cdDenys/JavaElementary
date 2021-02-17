import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InformationChecker {
    public static String checkPhone(String phone) {
        Pattern pattern = Pattern.compile("^\\+[3][8]\\(?[0]\\d{2}\\)?\\d{7}");
        Matcher input = pattern.matcher(phone);
        boolean match = input.matches();
        String resultOfPhone;
        if (match) {
            resultOfPhone = "Phone number " + phone + " is valid";
        } else {
            resultOfPhone = "Phone number " + phone + " is invalid";
        }
        return resultOfPhone;
    }

    public static String checkMail(String mail){
        Pattern pattern = Pattern.compile("^(.+)@([m][a][i][l].[c][o][m])$");
        Matcher input = pattern.matcher(mail);
        boolean match = input.matches();
        String resultOfMail;
        if (match) {
            resultOfMail = "Mail " + mail + " is valid";
        }else {
            resultOfMail = "Mail " + mail + " is invalid";
        }
        return resultOfMail;
    }

    public static String birthCheck(String birth){
        Pattern pattern = Pattern.compile("^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$");
        Matcher input = pattern.matcher(birth);
        boolean match = input.matches();
        String resultOfBirth;
        if (match) {
            resultOfBirth = "Date of birth " + birth + " is valid";
        }else {
            resultOfBirth = "Date of birth " + birth + " is invalid";
        }
        return resultOfBirth;
    }
}
