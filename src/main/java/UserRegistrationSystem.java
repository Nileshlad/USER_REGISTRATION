import java.util.regex.Pattern;

public class UserRegistrationSystem
{

    //DECLARE PATTERN
    String firstNamePattern = "^[A-Z][a-z]{2,}$";
    String lastNamePattern = "^[A-Z][a-z]{2,}$";
    String emailPattern = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
    String mobilePattern = "(0/91)?[7-9][0-9]{9}";
    String passwordPatternFirstRule = "^[a-zA-Z0-9]{8,}";
    String passwordPatternSecondRule = "^[A-Z][a-zA-Z0-9]{8,}"
    String passwordPatternThreeRule = "^[0-9][a-zA-Z0-9]{8,}"
    String passwordPatternFoureRule = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";

    //WELCOME MESSAGE
    public static void main (String args[]){
        System.out.println("WELL COME USER REGISTRATION SYSTEM");
    }

    //  METHOD TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern,firstName));
    }

    //  METHOD TO VALIDATE LAST NAME
    public boolean validatelastName(String emailName) {
       return (Pattern.matches(emailPattern,emailName));
    }

    // METHOD TO VALIDATE EMAIL
    public boolean validateEmailName(String emailName) {
        return (Pattern.matches(emailPattern,emailName));
    }

    // METHOD TO VALIDATE MOBILE NUMBER
    public boolean validateMobileNumber(String mobileNumber) {
        return (Pattern.matches(mobilePattern,mobileNumber));
    }

    // METHOD TO VALIDATE PASSWORD RULE ONE
    public boolean validatePasswordRuleOne((String passwordOne) {
        return (Pattern.matches(passwordPatternFirstRule,passwordOne));
    }
    // METHOD TO VALIDATE PASSWORD RULE Two
    public boolean validatePasswordRuleTwo((String passwordTwo) {
        return (Pattern.matches(passwordPatternSecondRule,passwordTwo));
    }
    // METHOD TO VALIDATE PASSWORD RULE FOURE
    public boolean validatePasswordRuleFoure((String passwordFoure) {
        return (Pattern.matches(passwordPatternFoureRule,passwordFoure));
    }

}