package ChainOfResponsibility_LogInSystem;

public class Account {
    private String userName;
    private String ip;

    public Account(String userName, String ip){
        this.userName = userName;
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
