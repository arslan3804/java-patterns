package practice6.factoryMethod;

public class ProductAFactory implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
