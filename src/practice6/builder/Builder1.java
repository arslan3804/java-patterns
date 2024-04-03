package practice6.builder;

public class Builder1 implements Builder{
    ComplexObject object;

    @Override
    public void createObject() {
        object = new ComplexObject();
    }

    @Override
    public void setType() {
        object.setType("A");
    }

    @Override
    public void setName() {
        object.setName("ComplexObject1");
    }

    @Override
    public ComplexObject getResult() {
        return object;
    }
}
