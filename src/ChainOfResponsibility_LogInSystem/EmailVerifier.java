package ChainOfResponsibility_LogInSystem;

public class EmailVerifier extends LogInHandler{
    @Override
    public Account handleLogIn(LogInData logInData) {
        String email = logInData.getEmail();
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("valid Email. continue...");
            return next.handleLogIn(logInData);
        }
        System.out.println("Email verification failed. Please enter a valid email!");
        return null;
    }
}
