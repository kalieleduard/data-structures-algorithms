package leetcodeSolutions.twoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {

    // Complexity O(n²)

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    // Complexity O(n)

    public int[] twoSumOn(int[] nums, int target) {
        final Map<Integer, Integer> indexMap = new HashMap<>();
        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];

            if (indexMap.containsKey(number)) {
                output[0] = indexMap.get(number);
                output[1] = i;
                return output;
            } else {
                indexMap.put(nums[i], i);
            }
        }

        return output;
    }
}
