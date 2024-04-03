package practice6.builder;

public class ComplexObject {
    private String type;
    private String name;
    public void setType(String type){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
