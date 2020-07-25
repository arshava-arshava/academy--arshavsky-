package by.academy.homework2.phoneValidator;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BelarusPhoneValidator implements Validator {
    private Pattern p = Pattern.compile("^\\+37529[\\d]{7}$");

    @Override
    public boolean validate(String vString) {
        Matcher m = p.matcher(vString);
        return m.find();
    }
}
