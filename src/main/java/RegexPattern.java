import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String emailId;
        // Eg -> abc.xyz@bl.co.in
        System.out.println(" enter email address with precise @ and . positions: ");
        emailId = sc.nextLine();
        confirmEmailAddress(emailId);
    }

    public static void confirmEmailAddress(String emailId) {
        Pattern pattern = Pattern.compile("[a-z]+[.][a-z]*[@][a-z]+[.][a-z]+[.][a-z]*");
        Matcher matcher = pattern.matcher(emailId);
        if (matcher.matches()) {
            System.out.println(" format of email address is correct " + emailId);
        } else {
            System.out.println(" format of email address is incorrect.");
        }
    }
}
