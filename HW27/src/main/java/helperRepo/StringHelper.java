package HelperRepo;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {
    public static final String EMAIL_VALIDATOR = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
    Pattern pattern = Pattern.compile(EMAIL_VALIDATOR);

    public Optional<String> getResult(String string){
        Matcher matcher = pattern.matcher(string);
        if (string.isEmpty() || string.isBlank() || !matcher.matches()){
            return Optional.empty();
        }else{
            return Optional.of(string);
        }
    }
}
