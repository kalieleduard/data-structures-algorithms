package quickSort.partitioning;

public class Partitioning {

    /**
     * Lomuto Partition
     */

    public int[] partition(final int[] anArray) {
        final var right = anArray.length - 1;
        final var left = 0;
        final var pivot = anArray[left];

        var i = left;

        for (int j = left + 1; j < right; j++) {
            if (anArray[j] <= pivot) {
                i++;
                swap(anArray, i, j);
            }
        }

        swap(anArray, left, i);
        return anArray;
    }

    private void swap(int[] anArray, int i, int j) {
        final var aux = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = aux;
    }
}
