package quickSort;

import java.util.Arrays;

public class QuickSortApplication {
    public static void main(String[] args) {
        final var aQuickSort = new QuickSort();
        final var anArray = new int[]{7, 8, 1, 2, 90, 4, 65, 32};
        final var aSortedArray = aQuickSort.quickSort(anArray, 0, anArray.length - 1);
        System.out.println(Arrays.toString(aSortedArray));
    }
}

