package main.helpers;

import java.util.List;

public class CompareListItems {

    /**
     * This will compare and return the match percentage of sourceList against the targetList.
     *
     * @return
     */
    public static float calculatePercentage(List sourceList, List targetList) {

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
}
