import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String MobileNumber;
        // Eg -> abc.xyz@bl.co.in
        System.out.println(" enter mobile number in which country code followed by space & 10 digit number: ");
        MobileNumber = sc.nextLine();
        confirmMobileNumber(MobileNumber);
    }

    public static void confirmMobileNumber(String MobileNumber) {
        Pattern pattern = Pattern.compile("^(\\+91|0)?[6-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(MobileNumber);
        if (matcher.matches()) {
            System.out.println(" format of mobile number is correct " + MobileNumber);
        } else {
            System.out.println(" format of mobile number is incorrect.");
        }
    }
}
