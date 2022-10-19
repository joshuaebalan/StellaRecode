public class FlowSolve implements Runnable () {
    FlowSolve fs = new FLowSolve();

    //public void run(Equation eq, VALUE vals) {
         while (!eq.operations.isEmpty) {//confident in this since no other types can be operands
            double o1 = (double)eq.operations.pop();
            double o2 = (double)eq.operations.pop();
            if (o1 = VOID_VAL) { //checking for recursive things
                o1 = FlowSolve(SymbolTables[conv(o1)]);//need to do a hashtable for this
            }
            if (o2 = VOID_VAL) { //same thing
                o2 = FlowSolve(SymbolTables[conv(o2)]);
            }
            switch ((char)eq.operations.pop()){ //tried to make these in order of how frequently the equations I work with use this
                case '*': //multiply
                    eq.operands.push((Object)(o1 * o2));
                    break;
                case '/'://divide
                    eq.operands.push((Object)(o1 / o2));
                    break;
                case '^'://power
                    eq.operands.push((Object)Math.pow(o1,o2));
                case '+': //add
                    eq.operands.push((Object)(o1 + o2));
                    break;
                case '-': //subtract
                    eq.operations.push(Object)(o1 - o2));
                    break;
                //I should probably add logarithms at some point
                default: //symbol not recognized
                    throw new InvalidExpressionException;
            }
         }
         if (eq.operands.size() == 1) {
            eq.setSOLVEDVAL((double)eq.operands.pop()); //when there are no operations left
         }
         else {
             throw new InvalidExpressionException; //bad ratio of operands to operations
         }
    //}
}
