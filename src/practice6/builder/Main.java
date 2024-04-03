package practice6.builder;

public class Main {
    public static void main(String[] args){
        Director director = new Director();
        director.setBuilder(new Builder1());
        ComplexObject object = director.construct();
        System.out.println(object);
    }
}
