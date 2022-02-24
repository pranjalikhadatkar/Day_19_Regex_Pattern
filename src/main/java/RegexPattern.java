import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String first_name;
        System.out.println(" enter first name starts with capital letter & it should have min 3 characters: ");
        first_name = sc.nextLine();
        confirmFirstName(first_name);
    }

    public static void confirmFirstName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            System.out.println(name + " format of name is in correct.");
        } else {
            System.out.println(" format of name is incorrect.");
        }
    }
}
