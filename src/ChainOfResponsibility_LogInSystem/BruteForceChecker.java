package ChainOfResponsibility_LogInSystem;

import java.util.HashMap;

public class BruteForceChecker extends LogInHandler{
    HashMap<String, Integer> numOfRequests = new HashMap<String, Integer>();
    @Override
    public Account handleLogIn(LogInData logInData) {
        Integer count = numOfRequests.get(logInData.getIp());

        if(count == null){
            count = 0;
        }

        if(count > 3){
            System.out.println("Too many Requests. Try again later.");
            return null;
        }

        numOfRequests.put(logInData.getIp(), count+1);
        System.out.println("BruteForce check passed! continue...");
        return next.handleLogIn(logInData);
    }
}
