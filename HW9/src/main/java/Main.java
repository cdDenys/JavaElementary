import java.util.*;

public class Main {
    public static InitializationData initializationData = new InitializationData();
    public static Information information = new Information();

    public static void main(String[] args) {
        initializationData.fillTen(information);
        System.out.println(initializationData.fillThirty(information));
        System.out.println("Set size: " + information.getMails().size());
        System.out.println("List size: " + information.getPseudonyms().size());
        System.out.println("Map size:" + information.getUsers().size());

//        System.out.println(initializationData.isSizeSame(information));
//        System.out.println(initializationData.isHaveSameValue(information));
        System.out.println("----------------------------------------------");

        List<Byte> bytes = new ArrayList<>();
        for (byte i = 0; i <= 35; i++) {
            bytes.add(i);
        }
        System.out.println(wildCards(bytes, information));
        System.out.println("Set size: " + information.getMails().size());
        System.out.println("List size: " + information.getPseudonyms().size());
        System.out.println("Map size:" + information.getUsers().size());
    }

    public static Information wildCards(List<? extends Number> lists, Information information) {
        for (int i = 0; i < lists.size(); i++) {
            if (!information.getMails().contains(lists.get(i) + "@mail.com")) {
                information.getPseudonyms().add(lists.get(i).toString());
                information.getMails().add("user" + lists.get(i) + "@mail.com");
                information.getUsers().put("user" + lists.get(i) + "@mail.com", "user" + lists.get(i));
            }
        }
        return information;
    }
}
