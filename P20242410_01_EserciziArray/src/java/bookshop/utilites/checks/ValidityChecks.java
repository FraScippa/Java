package bookshop.utilites.checks;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidityChecks {
    private static final String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    public static boolean checkEmail(String email){
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static final String cfRegex = "^[A-Z]{6}\\d{2}[A-Z]{1}\\d{2}[A-Z]{1}\\d{3}[A-Z]{1}$";
    public static boolean checkCodiceFiscale(String codiceFiscale) {
        Pattern pattern = Pattern.compile(cfRegex);
        Matcher matcher = pattern.matcher(codiceFiscale);
        return matcher.matches();
    }
    public static boolean checkDob(LocalDate dob) {
        LocalDate today = LocalDate.now();
        int diff = Period.between(dob, today).getYears();
        return diff > 18;
    }
}
