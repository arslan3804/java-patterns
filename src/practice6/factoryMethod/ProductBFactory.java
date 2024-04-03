package practice6.factoryMethod;

public class ProductBFactory implements Factory {
    @Override
    public Product createProduct(){
        return new ProductB();
    }
}