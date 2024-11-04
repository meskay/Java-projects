public abstract class Person {
    protected String name;

    public Person(String name) {
        this.setName(name);
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String sName =name.substring(1).toLowerCase();
        String cName =name.substring(0,1).toUpperCase();
        this.name = cName + sName;
    }
}
