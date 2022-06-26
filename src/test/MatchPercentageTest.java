package test;

import main.MatchPercentage;
import main.helpers.SampleClass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class MatchPercentageTest {

    private MatchPercentage matchPercentageObj;

    @BeforeEach
    public void setUp() {
        matchPercentageObj = new MatchPercentage();
    }

    /**
     * Case1 - 100% match, A list in B.
     */
    @Test
    public void test_100percentage_Match() {
        List A = new ArrayList();

        A.add("CAT");
        A.add("RAT");
        A.add("BAT");


        List B = new ArrayList();
        B.add("BAT");
        B.add("RAT");
        B.add("CAT");

        assertEquals(matchPercentageObj.calculateMatch(A, B), "100% match");
    }

    /**
     * Case2 - A contains B
     */
    @Test
    public void test_A_contains_B() {
        List A = new ArrayList();

        A.add("CAT");
        A.add("RAT");
        A.add("BAT");
        A.add("MAT");


        List B = new ArrayList();
        B.add("BAT");
        B.add("RAT");
        B.add("CAT");

        assertEquals(matchPercentageObj.calculateMatch(A, B), "A contains B");
    }

    /**
     * Case3 - B contains C
     */
    @Test
    public void test_B_contains_A() {
        List A = new ArrayList();

        A.add("CAT");
        A.add("RAT");
        A.add("BAT");


        List B = new ArrayList();
        B.add("BAT");
        B.add("RAT");
        B.add("CAT");
        B.add("MAT");

        assertEquals(matchPercentageObj.calculateMatch(A, B), "B contains A");
    }

    /**
     * Test case when there is 50% match of A against B
     */
    @Test
    public void test_50percentage_Match() {
        List A = new ArrayList();

        A.add("MAT");
        A.add("RAT");
        A.add("SAT");
        A.add("CAT");

        List B = new ArrayList();
        B.add("BAT");
        B.add("RAT");
        B.add("CAT");

        assertEquals(matchPercentageObj.calculateMatch(A, B), "50.0% match");
    }

    /**
     * Test case when both A & B are empty
     */
    @Test
    public void test_Both_A_B_Empty() {
        List A = new ArrayList();

        List B = new ArrayList();

        assertEquals(matchPercentageObj.calculateMatch(A, B), "100% match");
    }

    @Test
    public void test_A_Empty() {
        List A = new ArrayList();

        List B = new ArrayList();
        B.add("BAT");

        assertEquals(matchPercentageObj.calculateMatch(A, B), "B contains A");
    }

    @Test
    public void test_B_Empty() {
        List A = new ArrayList();
        A.add("BAT");

        List B = new ArrayList();

        assertEquals(matchPercentageObj.calculateMatch(A, B), "A contains B");
    }

    @Test
    public void test_Integer_50percentage_Match() {
        List A = new ArrayList();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);

        List B = new ArrayList();
        B.add(1);
        B.add(4);
        B.add(6);

        assertEquals(matchPercentageObj.calculateMatch(A, B), "50.0% match");
    }

    @Test
    public void test_Object_50percentage_Match() {
        List A = new ArrayList();

        SampleClass testObj1 = new SampleClass("Anshul", "Agrawal");

        A.add(testObj1);
        A.add(2);
        A.add(3);
        A.add(4);

        List B = new ArrayList();
        B.add(testObj1);
        B.add(4);
        B.add(6);

        assertEquals(matchPercentageObj.calculateMatch(A, B), "50.0% match");
    }

}