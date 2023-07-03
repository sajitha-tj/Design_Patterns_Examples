package ChainOfResponsibility_LogInSystem;

public class LogInData {
    private String email;
    private String password;
    private boolean rememberMe;
    private String ip;

    public LogInData(String email, String password, boolean rememberMe, String ip){
        this.email = email;
        this.password = password;
        this.rememberMe = rememberMe;
        this.ip = ip;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public String getIp(){
        return  ip;
    }
}
