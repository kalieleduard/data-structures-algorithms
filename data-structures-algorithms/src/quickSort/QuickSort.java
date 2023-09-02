package quickSort;

public class QuickSort {

    public int[] quickSort(int[] values, int left, int right) {
        if (left < right) {
            final var indexPivot = partition(values, left, right);
            quickSort(values, left, indexPivot - 1);
            quickSort(values, indexPivot + 1, right);
        }

        return values;
    }

    /**
     * Lomuto Partition
     */

    private int partition(int[] values, int left, int right) {
        final var pivot = values[left];

        var i = left;

        for (int j = left + 1; j <= right; j++) {
            if (values[j] <= pivot) {
                i++;
                swap(values, i, j);
            }
        }

        swap(values, left, i);
        return i;
    }

    private void swap(int[] values, int i, int j) {
        final var aux = values[i];
        values[i] = values[j];
        values[j] = aux;
    }
}
