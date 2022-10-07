import java.util.ArrayList;
public class Equation {
    public Equation (ArrayList<Char> operations, ArrayList<Float> operands, ArrayList<Integer> variableTables;) {
        this.operands = operands;
        this.operations = operations;
        this.variableTables = variableTables;
        numDependancies = variableTables.size();
    }
    public ArrayList<char[]> getOperations() {
        return operations;
    }

    public ArrayList<float[]> getOperands() {
        return operands;
    }

    public void setOperands(ArrayList<float[]> operands) {
        this.operands = operands;
    }

    public void setOperations(ArrayList<char[]> operations) {
        this.operations = operations;
    }

    private ArrayList<Float[]> operands;
    private ArrayList<Char[]> operations;
    private int numDependancies;
    private ArrayList<Equation> variableTables;


}