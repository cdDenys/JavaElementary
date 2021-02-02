public class InitializationData {
    public static final String MAIL = "@mail.com";
    public static final String PSEUDONYM = "user";

    public Information fillThirty(Information information) {
        for (int i = 1; i <= 30; i++) {
            information.getPseudonyms().add(PSEUDONYM + i);
            information.getMails().add(i + MAIL);
            information.getUsers().put(PSEUDONYM + i + MAIL, PSEUDONYM + i);
        }
        if (!isSizeSame(information)) {
            return null;
        }else{
            return information;
        }
    }

    public Information fillTen(Information information) {
        for (int i = 1; i <= 10; i++) {
            if (!isHaveSameValue(information)) {  //Я записал тут эту проверку, ибо List сохраняет все дубликаты. И если метод isHaveSameValue() возврашает true, то не происходит запись.
                information.getPseudonyms().add(PSEUDONYM);
            }
            information.getMails().add(MAIL);
            information.getUsers().put(PSEUDONYM + MAIL, PSEUDONYM);
        }
        return information;
    }

    //Change private to public, if you want to check in main
    private boolean isSizeSame(Information information) {
        boolean isSame = false;
        if (information.getUsers().size() == information.getMails().size() && information.getUsers().size() == information.getPseudonyms().size()) {
            isSame = true;
        }
        return isSame;
    }
    //Change private to public, if you want to check in main
    private boolean isHaveSameValue(Information information) {
        boolean isHave = false;
        if (information.getPseudonyms().contains(PSEUDONYM)) {
            isHave = true;
        }
        return isHave;
    }
}
