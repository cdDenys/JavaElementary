import exceptions.StringFormatException;
import utils.StringEditor;


public class Main {
    public static void main(String[] args) {

        String string = "qwerty";
        char[] chars = {'a', 's', 'd', 'f', 'g', 'h', 'j'};

        try {
            System.out.println(StringEditor.editString(string, chars));
        }catch (NullPointerException | StringFormatException s) {
            System.out.println("Incorrect");
        }

        System.out.println(InformationChecker.checkPhone("+380508888888"));
        System.out.println(InformationChecker.checkMail(string  + "@mail.com"));
        System.out.println(InformationChecker.birthCheck("08.12.1999"));
    }
}
