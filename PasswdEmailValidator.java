import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswdEmailValidator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

	// mohd mehdi [s/o Arshad Abbas Khan] 

        System.out.println("Enter E-mail address : ");
        String email = scanner.nextLine();
        System.out.println("Enter Password : ");
        String passwd = scanner.nextLine();

        String emailPatternValidation = "^[a-z0-9]+@[a-z+.]+$"; // abc123@fmail.com = from beginning(^) to end($)
        String passwdPatternValidation = "^[\\p{ASCII}]+$"; // allows all ascii character

        if ((email.matches(emailPatternValidation))){
            System.out.println("Correct email");
        }else{
            System.out.println("Invalid email");
        }
        if (passwd.matches(passwdPatternValidation)){
            System.out.println("valid password");
        }
        else{
            System.out.println("invalid password");
        }
    }
}
