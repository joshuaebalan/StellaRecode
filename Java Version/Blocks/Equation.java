import java.util.ArrayList;
public class Equation {
    public Equation (ArrayList<Character> operations, ArrayList<Float> operands, ArrayList<Equation> variableTables) {
        this.operands = operands;
        this.operations = operations;
        this.variableTables = variableTables;
        numDependancies = variableTables.size();
        SOLVEDVAL = 0.0;
    }
    public ArrayList<Character> getOperations() {
        return operations;
    }

    public ArrayList<Float> getOperands() {
        return operands;
    }

    public void setOperands(ArrayList<Float> operands) {
        this.operands = operands;
    }

    public void setOperations(ArrayList<Character> operations) {
        this.operations = operations;
    }

    public void setSOLVEDVAL(double solvedval) {
        this.SOLVEDVAL = solvedval;
    }

    private ArrayList<Float> operands;
    private ArrayList<Character> operations;
    private int numDependancies;
    private double SOLVEDVAL;
    private ArrayList<Equation> variableTables;


}