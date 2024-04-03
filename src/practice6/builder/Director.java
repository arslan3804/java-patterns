package practice6.builder;

public class Director {
    Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    ComplexObject construct(){
        builder.createObject();
        builder.setType();
        builder.setName();
        ComplexObject object = builder.getResult();
        return object;
    }
}
