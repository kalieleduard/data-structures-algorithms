package binarySearch;

public class BinarySearchApplication {
    public static void main(String[] args) {
        final var binarySearch = new BinarySearch();
        final var result = binarySearch.binarySearch(new int[]{1, 4, 5, 10, 15}, 4);
        System.out.println(result);
    }
}
