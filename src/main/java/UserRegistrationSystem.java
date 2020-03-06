import java.util.regex.Pattern;

public class UserRegistrationSystem {

    //DECLARE PATTERN
    String firstNamePattern="^[A-Z][a-z]{2,}$";

    //WELCOME MESSAGE
    public static void main (String args[]){
        System.out.println("WELL COME USER REGISTRATION SYSTEM");
    }

    //  METHOD TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern,firstName));
    }

}