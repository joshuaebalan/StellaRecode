public class Constant {
    public Constant (String name) {
        this.name = name;
        value = null;
    }
    public Constant (String name, Equation value) {
        this.name = name;
        this.value = value;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Equation getValue() {
        return value;
    }

    public void setValue(Equation value) {
        this.value = value;
    }

    private String name;
    private Equation value;
}