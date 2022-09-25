public class Flow {
    public Flow (String name, Equation equation) {
        this.equation = equation;
        this.name = name;
    }
    public Flow (String name) {
        this.name = name;
        equation = null;
    }

    public String getName() {
        return name;
    }

    public Equation getEquation() {
        return equation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEquation(Equation equation) {
        this.equation = equation;
    }

    private String name;
    private Equation equation;
}