package Singleton_DBconnection;

public class DBconnection {
    private static volatile DBconnection instance;

    public String getData() {
        return data;
    }

    private String data;

    private DBconnection(String data){
        this.data = data;
    }

    public static DBconnection getInstance(String data){
        if(instance == null) {
            synchronized (DBconnection.class) {
                if (instance == null) {
                    instance = new DBconnection(data);
                }
            }
        }
        return instance;
    }


}
