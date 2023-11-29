package leetcodeSolutions.palindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        final var stringNumber = String.valueOf(x);
        var isPalindrome = true;

        int index = 0;

        for (int i = stringNumber.toCharArray().length - 1; i >= 0; i--) {
            if (!(stringNumber.toCharArray()[i] == stringNumber.toCharArray()[index])) {
                isPalindrome = false;
                break;
            }

            index++;
        }

        return isPalindrome;
    }
}