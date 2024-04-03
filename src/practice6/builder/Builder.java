package practice6.builder;

public interface Builder {
    void createObject();
    void setType();
    void setName();
    ComplexObject getResult();
}
