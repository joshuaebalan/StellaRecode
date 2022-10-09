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

    public Equation equationBuilder (String[] input, Scheme scheme) throws InvalidExpressionException {
        EQSTACK operands = new EQSTACK(); //Initialize operands stack
        EQSTACK operations = new EQSTACK(); //Initialize operations stack
        ArrayList<Constant> variableTables = new ArrayList<>(); //Initialize variableTables for later use
        for (int i = 0; i < splitInput.length; i++) { //Iterating over input string
            if (splitInput[i].isNumeric) { //if it's just a number
                operands.PUSH((Object)Float.parseFloat(splitInput[i])) //push it to the operations stack
            }
            else if (splitInput[i].charAt[0] = '~') { //Variables are designated as ~NAME
                try { //Try to find what variable you're referring to
                    Constant NewSymbol = symbolConverter(splitInput[i].substring(1, splitInput[i].length), scheme);
                }
                catch (InvalidExpressionException e) { //couldn't find it
                    throw new InvalidExpressionException;
                }
                operands.PUSH((Object)ESCAPE_KEY); //todo: assign this. It'll probably be a hash table thing
                variableTables.add(i); //same as prevoius. Hash it up
            }
            else if (splitInput[i].charAt[0] = '(') { //If we're entering a set of parens, then add it as a recursive depandency
                int x = -1;
                for (int j = i; j < splitInput.length; j++) {
                    if (splitInput[j].charAt[0] = ')') { //looking for the ending ')'
                        x = j; //found the index of it
                        break;
                    }
                }
                if (x < 0) { //Couldn't find it
                    throw new InvalidExpressionException;
                }
                else {//make a new equation without the (). i.e. Equation((5^2)) becomes new Equation(5^2)
                    String[] subinput = new String[x - i - 2];
                    for (int k = i + 1; k < x - 1 ; k++) {
                        subinput[x - k] = splitInput[k];
                    }
                    Constant cons = new Constant(i.toString, equationBuilder(subinput, scheme)); //recursive call
                    operands.PUSH(ESCAPE_KEY);
                    symboltables.add(i);
                }
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

    //Need to find a Constant to put to a name? Look no further!
    public Constant symbolConverter(String symbol, Scheme scheme) throws InvalidExpressionException {
        for (int i = 0; i < scheme.constants.size(); i++) { //checks constants, since nothing depends on flows
            if (scheme.constants.get(i).name.equals(symbol)) {
                return scheme.constants.get(i);
            }
        }
        throw new InvalidExpressionException;
    }

    //In progress: Reduce the amount of computations the builder has to do
    public Equation optimize(Equation eq) {
        return eq;
    }
}