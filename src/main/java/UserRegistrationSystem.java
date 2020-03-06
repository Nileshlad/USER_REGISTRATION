import java.util.regex.Pattern;

public class UserRegistrationSystem {

    //DECLARE PATTERN
    String firstNamePattern="^[A-Z][a-z]{2,}$";
    String lastNamePattern="^[A-Z][a-z]{2,}$";
    //WELCOME MESSAGE
    public static void main (String args[]){
        System.out.println("WELL COME USER REGISTRATION SYSTEM");
    }

    //  METHOD TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern,firstName));
    }

    //  METHOD TO VALIDATE LAST NAME
    public boolean validatelastName(String lastName) {
       return (Pattern.matches(lastNamePattern,lastName));
    }



}