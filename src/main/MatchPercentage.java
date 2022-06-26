package main;

import java.util.ArrayList;
import java.util.List;

public class MatchPercentage {

    /**
     * This will compare the list items and return the match percentage of sourceList against the targetList.
     *
     * @param sourceList - Source list which should be compared.
     * @param targetList - Target list against which source list should be compared.
     *
     * @return percentage - The percentage of the sourceList and targetList calculation.
     */
    public float calculatePercentage(List sourceList, List targetList) {

        int sourceListLength = sourceList.size();
        int sourceListMatchedLength = 0;

        if (sourceListLength == 0) {
            return 100;
        }

        for (int i=0; i < sourceList.size(); i++) {

            // item exists, hence increment the match count
            if (targetList.contains(sourceList.get(i))) {
                sourceListMatchedLength++;
            }
        }

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
    public String calculateMatch(List A, List B) {

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
