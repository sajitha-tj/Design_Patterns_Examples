package ChainOfResponsibility_LogInSystem;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<String,Account> cachedAccounts = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email, password, remeberMe, ip;
        boolean rememberMeBool;

        LogInHandler savedAccChecker = new SavedAccChecker();
        LogInHandler bruteForceChecker = new BruteForceChecker();
        LogInHandler emailVerifier = new EmailVerifier();
        LogInHandler passwordChecker = new PasswordChecker();
        LogInHandler rememberMeHandler = new RememberMeHandler();

        savedAccChecker.setNext(bruteForceChecker);
        bruteForceChecker.setNext(emailVerifier);
        emailVerifier.setNext(passwordChecker);
        passwordChecker.setNext(rememberMeHandler);

        while (true){
            System.out.println("Enter email:");
            email = scanner.nextLine();
            if(email.equals("-1")){break;} // stops the program
            System.out.println("Enter password:");
            password = scanner.nextLine();
            System.out.println("Remember me? (y/n)");
            remeberMe = scanner.nextLine();
            System.out.println("Enter IP:");
            ip = scanner.nextLine();

            rememberMeBool = remeberMe.equals("y");

            LogInData logInData = new LogInData(email,password,rememberMeBool,ip);
            Account myAcc = savedAccChecker.handleLogIn(logInData);
            if(myAcc != null){
                System.out.println("login Successful!");
                System.out.println(myAcc);
            }
            else {
                System.out.println("Login failure!");
            }
        }
    }
}
