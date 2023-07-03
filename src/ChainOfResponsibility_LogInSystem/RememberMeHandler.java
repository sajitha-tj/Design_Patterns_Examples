package ChainOfResponsibility_LogInSystem;

public class RememberMeHandler extends LogInHandler{
    @Override
    public Account handleLogIn(LogInData logInData) {
        Account account = new Account(logInData.getEmail(), logInData.getIp());
        if(logInData.isRememberMe()){
            Main.cachedAccounts.put(logInData.getEmail(), account);
            System.out.println("Account Saved!");
        }
        return account;
    }
}
