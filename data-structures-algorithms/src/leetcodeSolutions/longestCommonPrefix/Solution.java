package leetcodeSolutions.longestCommonPrefix;

public class Solution {
    public static void main(String[] args) {
        final var stringList = new String[]{"flower", "floswer", "foswer", "aflight"};
        final var longestCommonPrefix = new LongestCommonPrefixApplication().longestCommonPrefix(stringList);
        System.out.println(longestCommonPrefix);
    }
}
