package practice5;

public class Singleton1 {
    private static Singleton1 instance;
    private String message = "";

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void showMessage(){
        System.out.println(message);
    }
}
