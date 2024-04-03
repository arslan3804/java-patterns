package practice6.prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setType(ConcretePrototype.Type.ONE);

        ConcretePrototype clone = prototype.copy();
        clone.setType(ConcretePrototype.Type.TWO);

        System.out.println(prototype);
        System.out.println(clone);
    }
}
