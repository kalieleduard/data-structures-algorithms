package leetcodeSolutions.twoSum;

import java.util.Arrays;

public class TwoSumApplication {
    public static void main(String[] args) {
        final var solution = new Solution();
        final var anArray = new int[]{2,7,11,15};
        final var twoSum = solution.twoSum(anArray, 9);
        System.out.println(Arrays.toString(twoSum));
    }
}
