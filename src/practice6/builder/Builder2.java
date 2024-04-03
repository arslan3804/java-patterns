package practice6.builder;

public class Builder2 implements Builder{
    ComplexObject object;

    @Override
    public void createObject() {
        object = new ComplexObject();
    }

    @Override
    public void setType() {
        object.setType("B");
    }

    @Override
    public void setName() {
        object.setName("ComplexObject2");
    }

    @Override
    public ComplexObject getResult() {
        return object;
    }
}