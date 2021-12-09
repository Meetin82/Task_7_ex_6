package ru.vsu.cs.semenov_d_s;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        int[] testingArray = new int[]{1, 1, 1, 2, 2, 3, 5, 6};
        int expectedResult = 3;
        int factualResult = solution.countMaxAmountOfIdenticalNumbersInRow(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test2() {
        int[] testingArray = new int[]{2, 2, 1, 3, 2, 8, 9};
        int expectedResult = 2;
        int factualResult = solution.countMaxAmountOfIdenticalNumbersInRow(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test3() {
        int[] testingArray = {3, 2, 1, 1, 2, 2, 2};
        int expectedResult = 3;
        int factualResult = solution.countMaxAmountOfIdenticalNumbersInRow(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test4() {
        int[] testingArray = {7, 8, 9, 9, 1, 2, 2, 2, 2};
        int expectedResult = 4;
        int factualResult = solution.countMaxAmountOfIdenticalNumbersInRow(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test5() {
        int[] testingArray = {1, 2, 3, 4, 5, 5};
        int expectedResult = 2;
        int factualResult = solution.countMaxAmountOfIdenticalNumbersInRow(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test6() {
        int[] testingArray = {5, 4, 3, 3, 2, 2, 1, 1, 1};
        int expectedResult = 3;
        int factualResult = solution.countMaxAmountOfIdenticalNumbersInRow(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test7() {
        int[] testingArray = {2, 2, 2, 2, 1, 1, 4, 3};
        int expectedResult = 4;
        int factualResult = solution.countMaxAmountOfIdenticalNumbersInRow(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test8() {
        int[] testingArray = {9, 5, 3, 3, 3, 2, 2};
        int expectedResult = 3;
        int factualResult = solution.countMaxAmountOfIdenticalNumbersInRow(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test9() {
        int[] testingArray = {2, 3, 6, 7, 7, 7, 9, 9, 9, 9};
        int expectedResult = 4;
        int factualResult = solution.countMaxAmountOfIdenticalNumbersInRow(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void test10() {
        int[] testingArray = {1, 9, 2, 3, 4, 4, 5, 5, 5, 5, 5};
        int expectedResult = 5;
        int factualResult = solution.countMaxAmountOfIdenticalNumbersInRow(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }
}