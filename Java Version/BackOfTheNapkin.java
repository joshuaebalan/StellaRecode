//This file is an experiment ground
public class BackOfTheNapkin {

    //Prioritizes which Equations to solve first, based on the number of dependancies, so that the SOLVE equation works most efficiently.

    public Equation[] prioritize(Arraylist<Equation> e) {
        int minDep = Integer.MAX_VALUE;
        int minDex = 0;
        int workingIndex = 0;
        Equation[] returned = new Equation[e.size()];
        while (e.size != 0) {
            for (int i = 0; i < e.size(); i++) {
                if (minDep < e.get(i).numDepandancies) {
                    minDex = i;
                    minDep = e.get(i).numDepandancies;
                }
                returned[workingIndex] = e.get(minDex);
                e.remove(minDex);
                minDep = Integer.MAX_VALUE;
                minDex = 0;
                workingIndex++;
            }
        }
        return returned;
    }

    public VALUE[] SOLVE(Equation[] sorted, double TIME) {
        VALUE[] vals = new VALUE[sorted.length];
        for (int i = 0; i < sorted.length; i++) {

        }
    }


}
