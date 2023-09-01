package quickSort.partitioning;

import java.util.Arrays;

public class PartitioningApplication {
    public static void main(String[] args) {
        final var anArray = new int[]{7, 8, 1, 2, 90, 4, 65, 32};
        final var aPartitioning = new Partitioning();
        final var partitionedArray = aPartitioning.partition(anArray);
        System.out.println(Arrays.toString(partitionedArray));
    }
}

