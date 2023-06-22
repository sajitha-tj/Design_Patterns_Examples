package Singleton_DBconnection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Same data will be stored and printed if only one instance of the object is created.");
        System.out.println("If multiple instances are created, then different data will be stored and printed.");
        System.out.println();

        DBconnection dbc1 = DBconnection.getInstance("Hello! I'm dbc1");
        System.out.println(dbc1.getData() + " in main Thread");

        DBconnection dbc2 = DBconnection.getInstance("Hey Its dbc2");
        System.out.println(dbc2.getData() + " in main Thread");

        Thread t1 = new Thread(() -> {
           DBconnection dbc3 = DBconnection.getInstance("Hey Its dbc3");
           System.out.println(dbc3.getData() + " in thread t1");
        });
        t1.start();

        Thread t2 = new Thread(() -> {
           DBconnection dbc4 = DBconnection.getInstance("Hey Its dbc4");
           System.out.println(dbc4.getData() + " in thread t2");
        });
        t2.start();
    }
}
