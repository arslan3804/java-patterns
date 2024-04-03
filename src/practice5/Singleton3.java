package practice5;

public enum Singleton3 {
    INSTANCE;
    private String message = "";

    public void setMessage(String message){
        this.message = message;
    }

    public void showMessage(){
        System.out.println(message);
    }
}