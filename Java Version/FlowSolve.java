public class FlowSolve implements Runnable () {
    FlowSolve fs = new FLowSolve();
    public void run(Equation eq, VALUE vals) {
         while (!eq.operations.isEmpty) {
            double o1 = eq.operations.pop();
            double o2 = eq.operations.pop();
            if (o1 = VOID_VAL) { //checking for recursive things
                o1 = FlowSolve(SymbolTables[conv(o1)]);//need to do a hashtable for this
            }
            if (o2 = VOID_VAL) {
                o2 = FlowSolve(SymbolTables[conv(o2)]);
            }
            switch (eq.operations.pop()){
                case '*':
                    eq.operands.push(o1 * o2);
                    break;
                case '+':
                    eq.operands.push(o1 + o2);
                    break;
                case '/':
                    eq.operands.push(o1 / o2);
                    break;
                case '-':
                    eq.operations.push(o1 - o2);
                    break;
                default:
                    break;
            }
         }
         eq.setSOLVEDVAL(eq.operands.pop())
    }
}
