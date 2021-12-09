package ru.vsu.cs.semenov_d_s;

public class Solution {

    public int countMaxAmountOfIdenticalNumbersInRow(int[] arr) {
        int greatCount = 0;
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                count++;
            } else {
                count = 1;
            }
            if (count > greatCount) {
                greatCount = count;
            }
        }
        if (greatCount == 1){
            return 0;
        } else {
            return greatCount;
        }
    }
}
