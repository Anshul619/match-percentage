package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MatchPercentage {

    /**
     * This will compare the collection items and return the match percentage of sourceList against the targetList.
     *
     * @param sourceList - Source list which should be compared.
     * @param targetList - Target list against which source list should be compared.
     *
     * @return percentage - The percentage of the sourceList against targetList calculation.
     */
    public float calculatePercentage(Collection sourceList, Collection targetList) {

        int sourceListLength = sourceList.size();

        if (sourceListLength == 0) {
            return 100;
        }

        long sourceListMatchedLength = sourceList.stream().filter(s->targetList.contains(s)).count();

        float percentage = ((float)sourceListMatchedLength/sourceListLength*100);
        return percentage;
    }

    /**
     * This method match A & B list and return the output match.
     *
     * @param A - sourceList
     * @param B - targetList
     *
     * @return String
     */
    public String calculateMatch(Collection A, Collection B) {

        float percentageAB = calculatePercentage(A, B);
        float percentageBA = calculatePercentage(B, A);

        if (Float.compare(percentageAB, percentageBA) == 0) {
            return "100% match";
        }
        else if (percentageAB == 100) {
            return "B contains A";
        }
        else if (percentageBA == 100) {
            return "A contains B";
        }

        return percentageAB + "% match";

    }

    /**
     * Main driver method
     *
     * @param args
     */
    public static void main(String[] args) {

        List A = new ArrayList();

        List B = new ArrayList();
        B.add("BAT");
        B.add("RAT");
        B.add("CAT");

        MatchPercentage obj = new MatchPercentage();
        System.out.println(obj.calculateMatch(A, B));

    }
}
