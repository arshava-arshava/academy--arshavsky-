package by.academy.homework2.phoneValidator;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AmericanPhoneValidator implements Validator {
    private Pattern p = Pattern.compile("^\\+1[\\d]{11}$");

    @Override
    public boolean validate(String vString) {
        Matcher m = p.matcher(vString);
        return m.find();
    }
}
