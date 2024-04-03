package practice5;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        exampleSingleton1();
    }

    public static void exampleSingleton1(){
        Random random = new Random();
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.setMessage("Singleton hash1 = " + random.nextInt());
        singleton1.showMessage();

        Singleton1 newSingleton1 = Singleton1.getInstance();
        newSingleton1.showMessage();
    }

    public static void exampleSingleton2(){
        Random random = new Random();
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.setMessage("Singleton2 hash = " + random.nextInt());
        singleton2.showMessage();

        Singleton2 newSingleton2 = Singleton2.getInstance();
        newSingleton2.showMessage();
    }

    public static void exampleSingleton3(){
        Random random = new Random();
        Singleton3 singleton3 = Singleton3.INSTANCE;
        singleton3.setMessage("Singleton3 hash = " + random.nextInt());
        singleton3.showMessage();

        Singleton3 newSingleton3 = Singleton3.INSTANCE;
        newSingleton3.showMessage();
    }
}
