package utils;

import exceptions.StringFormatException;

public class StringEditor {
    public static String editString(String string, char[] chars) throws NullPointerException, StringFormatException {
        String charsToString;
        String fullString;
        if (chars != null && chars.length != 0) {
            charsToString = String.valueOf(chars);
        } else {
            throw new NullPointerException();
        }

        if (charsToString.trim().isEmpty() && charsToString.trim().isBlank() || string.trim().isEmpty() && string.trim().isBlank()) {
            throw new StringFormatException();
        } else {
            string = string.toUpperCase().trim();
            charsToString = charsToString.toLowerCase().trim();
        }

        fullString = string + " " + charsToString;
        String result;
        if (fullString.length() % 2 == 0) {
            result = fullString.substring((fullString.length() / 2) - 1, (fullString.length() / 2) + 1);
        } else {
            result = fullString.substring(fullString.length() / 2, fullString.length() / 2 + 1);
        }
        return result;

    }
}
