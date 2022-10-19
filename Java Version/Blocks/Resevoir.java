import java.util.ArrayList;
/*
 * Creates a RESEVOIR Object.
 * See README.md for details
 */
public class Resevoir {
    public  Resevoir(String name) {
        this.name = name;
        VALUE = 0;
        Flows_In = new ArrayList<>();
        Flows_Out = new ArrayList<>();
        Net_Flow = null;
    }
    public Resevoir(String name, float VALUE) {
        this.name = name;
        this.VALUE = VALUE;
        Flows_In = new ArrayList<>();
        Flows_Out = new ArrayList<>();
        Net_Flow = null;
    }
    public float getVALUE() {
        return VALUE;
    }
    public void setVALUE(float VALUE) {
        this.VALUE = VALUE;
    }

    public ArrayList<Flow> getFlows_In() {
        return Flows_In;
    }

    public ArrayList<Flow> getFlows_Out() {
        return Flows_Out;
    }

    public Equation getNet_flow() {
        return Net_Flow;
    }

    public void setFlows_In(ArrayList<Flow> Flows_In) {
        this.Flows_In = Flows_In;
    }

    public void setFlows_Out(ArrayList<Flow> Flows_Out) {
        this.Flows_Out = Flows_Out;
    }

    public void setNet_flow(Equation Net_Flow) {
        this.Net_Flow = Net_Flow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private float VALUE;
    private ArrayList<Flow> Flows_In;
    private ArrayList<Flow> Flows_Out;
    private Equation Net_Flow;
    private String name;
}