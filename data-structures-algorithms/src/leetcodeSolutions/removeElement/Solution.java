package leetcodeSolutions.removeElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        final int[] expectedNums = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                expectedNums[k] = nums[i];
                k++;
            }
        }

        nums = new int[k];

        for (int i = 0; i < k; i++) {
            nums[i] = expectedNums[i];
        }

        return k;
    }
}
