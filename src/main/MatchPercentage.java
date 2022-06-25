package main;

import main.helpers.CompareListItems;

import java.util.List;

public class MatchPercentage {

    /**
     * This method match A & B list and return the output match.
     *
     * @param A
     * @param B
     * @return
     */
    public String calculateMatch(List A, List B) {

        float percentageAB = CompareListItems.calculatePercentage(A, B);
        float percentageBA = CompareListItems.calculatePercentage(B, A);

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

    /*public static void main(String[] args) {

        List A = new ArrayList();

        List B = new ArrayList();
        B.add("BAT");
        B.add("RAT");
        B.add("CAT");

        MatchPercentage obj = new MatchPercentage();
        System.out.println(obj.calculateMatch(A, B));

    }*/
}
