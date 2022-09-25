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
public class Builders throws OverWriteException {
    public void bind(int mode, Equation equation, Object Recip) {
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
}