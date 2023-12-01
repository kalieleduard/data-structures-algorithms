package leetcodeSolutions.longestCommonPrefix;

public class Solution {
    public static void main(String[] args) {
        final var stringList = new String[]{"flo", "flo", "flo", "flo"};
        final var longestCommonPrefix = new LongestCommonPrefixApplication().longestCommonPrefix(stringList);
        System.out.println(longestCommonPrefix);
    }
}
