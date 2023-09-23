package leetcodeSolutions.romanToInteger;

public class RomainToIntegerApplication {
    public static void main(String[] args) {
        final var solution = new Solution();
        final String romainNumber = "MMMCMXCIX";
        System.out.println(solution.romanToInt(romainNumber));
    }
}
