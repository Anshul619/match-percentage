package main;

import java.util.ArrayList;
import java.util.List;

public class MatchPercentage {

    /**
     * This will compare the list items and return the match percentage of sourceList against the targetList.
     *
     * @return
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
     * @param A
     * @param B
     * @return
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
