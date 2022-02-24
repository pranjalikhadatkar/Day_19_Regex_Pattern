import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String last_name;
        System.out.println(" enter last name starts with capital letter & it should have min 3 characters: ");
        last_name = sc.nextLine();
        confirmLastName(last_name);
    }

    public static void confirmLastName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            System.out.println(" format of lastname is correct " + name);
        } else {
            System.out.println(" format of lastname is incorrect.");
        }
    }
}
