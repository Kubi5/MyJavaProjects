package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {
    public static Boolean isEmailValid(String email){
        final String regexPattern = "^(.+)@(\\S+)$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static Boolean isPasswordValid(String password){
        final String regexPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
