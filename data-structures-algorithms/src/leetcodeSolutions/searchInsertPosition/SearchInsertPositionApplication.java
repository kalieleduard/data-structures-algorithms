package leetcodeSolutions.searchInsertPosition;

public class SearchInsertPositionApplication {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            final int middle = (left + right) / 2;

            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else if (target == nums[middle]) {
                return middle;
            }
        }

        return left;
    }
}
