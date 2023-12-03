package leetcodeSolutions.validParentheses;

public class ValidParenthesesApplication {
    public static void main(String[] args) {
        final String aString = "(()[]{})";
        final var validParentheses = new Solution();
        System.out.println(validParentheses.isValid(aString));
    }
}
