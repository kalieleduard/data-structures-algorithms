package binarySearch;

public class BinarySearch {
    public int binarySearch(final int[] orderedArray, final int index) {
        var minor = 0;
        var major = orderedArray.length - 1;

        while (minor != major) {
            var middle = (minor + major) / 2;
            var kick = orderedArray[middle];

            if (kick == orderedArray[index]) {
                return kick;
            } else if (kick > orderedArray[index]) {
                major = middle - 1;
            } else {
                minor = middle + 1;
            }
        }

        return orderedArray[minor];
    }
}
