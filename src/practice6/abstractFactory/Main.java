package practice6.abstractFactory;

public class Main {
    public static void main(String[] args){
        AbstractFactory abstractFactory = createFactoryByType(1);

        AbstractProductA productA = abstractFactory.createProductA();
        productA.showTypeProductA();

        AbstractProductB productB = abstractFactory.createProductB();
        productB.showTypeProductB();
    }
    public static AbstractFactory createFactoryByType(int type){
        switch (type) {
            case 1:
                return new ConcreteFactory1();
            case 2:
                return new ConcreteFactory2();
            default:
                throw new RuntimeException("Неверный тип продукта");
        }
    }
}
