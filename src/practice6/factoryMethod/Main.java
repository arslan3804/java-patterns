package practice6.factoryMethod;

public class Main {
    public static void main(String[] args){
        Factory factory = createFactoryByType("A");
        Product product = factory.createProduct();
        product.showName();
    }
    public static Factory createFactoryByType(String type) {
        switch (type) {
            case "A":
                return new ProductAFactory();
            case "B":
                return new ProductBFactory();
            default:
                throw new RuntimeException("Неверный тип продукта");
        }
    }
}
