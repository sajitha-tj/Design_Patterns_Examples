package ChainOfResponsibility_LogInSystem;

public class PasswordChecker extends LogInHandler{
    @Override
    public Account handleLogIn(LogInData logInData) {
        if(logInData.getPassword().equals("admin")){
            System.out.println("password Correct. continue...");
            return next.handleLogIn(logInData);
        }
        System.out.println("Invalid Credentials. Try again!");
        return null;
    }
}
