package ChainOfResponsibility_LogInSystem;

public class SavedAccChecker extends LogInHandler{
    @Override
    public Account handleLogIn(LogInData logInData) {
        Account acc = Main.cachedAccounts.get(logInData.getEmail());
        if(acc == null){
            System.out.println("No saved accounts matched!");
            return next.handleLogIn(logInData);
        }
        System.out.println("saved account found");
        return acc;
    }
}
