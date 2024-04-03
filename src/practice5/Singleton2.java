package practice5;


public class Singleton2 {
    private String message = "";
    private Singleton2() {}

    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return Singleton2.SingletonHolder.INSTANCE;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void showMessage(){
        System.out.println(message);
    }
}