package practice6.prototype;

class ConcretePrototype implements Prototype {
    private Type type;
    public enum Type {
        ONE, TWO, THREE, FOUR, FIVE
    }
    public ConcretePrototype copy() {
        ConcretePrototype prototype1 = new ConcretePrototype();
        return prototype1;
    }
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "type=" + type +
                '}';
    }
}

