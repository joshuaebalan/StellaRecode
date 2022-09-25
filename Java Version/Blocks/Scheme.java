import java.util.Arraylist;
public class Scheme {

    public Scheme(constants, flows, resevoirs) {
        this.constants = constants;
        this.flows = flows;
        this.resevoirs = resevoirs;
    }

    public void setConstants(ArrayList<Constant> constants) {
        this.constants = constants;
    }

    public void setFlows(ArrayList<Flow> flows) {
        this.flows = flows;
    }

    public ArrayList<Constant> getConstants() {
        return constants;
    }

    public ArrayList<Flow> getFlows() {
        return flows;
    }

    public ArrayList<Resevoir> getResevoirs() {
        return resevoirs;
    }

    public void setResevoirs(ArrayList<Resevoir> resevoirs) {
        this.resevoirs = resevoirs;
    }

    private ArrayList<Constant> constants;
    private ArrayList<Flow> flows;
    private ArrayList<Resevoir> resevoirs;

}