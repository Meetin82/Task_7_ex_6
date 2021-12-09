package ru.vsu.cs.semenov_d_s;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = ArrayUtils.readIntArrayFromConsole();

        int maxAmountOfIdenticalNumbersInRow = solution.countMaxAmountOfIdenticalNumbersInRow(arr);

        printMaxAmountOfIdenticalNumbersInRow(maxAmountOfIdenticalNumbersInRow);
    }

    private static void printMaxAmountOfIdenticalNumbersInRow(int maxAmountOfIdenticalNumbersInRow) {
        System.out.println("Maximum amount of identical numbers in row: " + maxAmountOfIdenticalNumbersInRow);
    }
}

