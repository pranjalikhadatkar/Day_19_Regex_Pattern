import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.Z;

public class RegexPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String emails;
        System.out.println(" enter email which contains all email sample as per rules: ");
        emails = sc.nextLine();
        confirmpassword(emails);
    }

    public static void confirmpassword(String password) {
        Pattern pattern = Pattern.compile("^[a-z0-9]{3,}+([+.-_][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println(" format of email is correct " + password);
        } else {
            System.out.println(" format of email is incorrect.");
        }
    }
}
