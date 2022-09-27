import java.util.ArrayList;
import Blocks.Equation;
/*
 * MODE CONSTANTS:
 * 1: UNCONFIRMED(I.E. NOT ALLOWING USER TO OVERWRITE) FLOW RECIP.
 * 2: UNCONFIRMED CONSTANT RECIPIENT
 * 3: CONFIRMED(ALLOWING OVERRIDES) FLOW RECIPIENT
 * 4: CONFIRMED CONSTANT RECIPIENT
 */

/*
 * This function binds an ALREADY CREATED Equation to
 * an ALREADY CREATED recipient, compatible with both FLOW and CONSTANT
 * recipients.
 */
public class Builders {
    public void bind(int mode, Equation equation, Object Recip) throws OverWriteException {
        if (mode % 2 == 1) {
            Flow recip = (Flow) Recip;
        }
        else {
            Constant recip = (Constant) Recip;
        }

        if (recip.equation != null) {
            throw new OverWriteException("Overwriting Equation of " + recip.name + "!\n")
        }
        recip.equation = equation;
    }

    public Equation equationBuilder (String input, Scheme scheme) throws InvalidExpressionException {
        String[] splitInput = input.split(" ");
        ArrayList<float> operands = new ArrayList<>();
        ArrayList<char> operations = new ArrayList<>();
        ArrayList<Integer> variableTables = new ArrayList<>();
        for (int i = 0; i < splitInput.length; i++) {
            if (splitInput[i].isNumeric) {
                operands.add(Float.parseFloat(splitInput[i]))
            }
            else if (splitInput[i].charAt[0] = '~') {
                float NewSymbol = symbolConverter(splitInput[i].substring(1, splitInput[i].length), scheme);
                operands.add(NewSymbol);
                variableTables.add(i);
            }
            else if (splitInput[i].charAt[0] = '(') {
                //TODO: figure this out
            }
            else {
                if (strlen(splitInput[i]) != 1) {
                    throw new InvalidExpressionException;
        }
                operations.add(splitInput[i].charAt[0]);
            }
        }
        return new Equation(operations, operands, variableTables);
    }
    public float symbolConverter(String symbol, Scheme scheme) throws InvalidExpressionException {
        for (int i = 0; i < scheme; i++) { //checks constants first
            if ()
        }
    }
}