import java.math.BigInteger;

public class Day2_AddBinary {
    // LeetCode-like method: static for convenience
    public static String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, answer;

        while (y.compareTo(zero) != 0) {
            answer = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = answer;
            y = carry;
        }

        return x.toString(2);
    }

    // Simple main method to demonstrate and test the implementation
    public static void main(String[] args) {
        String[][] tests = {
            {"11", "1"},
            {"1010", "1011"},
            {"0", "0"},
            {"1111", "1111"}
        };
        for (String[] t : tests) {
            System.out.printf("%s + %s = %s\n", t[0], t[1], addBinary(t[0], t[1]));
        }
    }
}
