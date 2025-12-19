package easy;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 *
 *
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 *
 * Constraints:
 *
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 *
 * https://leetcode.com/problems/add-binary/
 */
class AddBinary {

    public String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int aLen = a.length();
        int bLen = b.length();
        int idx = 1;
        int aIdx = aLen - idx;
        int bIdx = bLen - idx;
        StringBuilder sb = new StringBuilder();
        int overflow = 0;
        while (aIdx >= 0 || bIdx >= 0 || overflow > 0) {
            int sum = overflow;
            if (aIdx >= 0 && bIdx >= 0) {
                sum += Character.getNumericValue(aChars[aIdx]) + Character.getNumericValue(bChars[bIdx]);
            } else if (aIdx >= 0) {
                sum += Character.getNumericValue(aChars[aIdx]);
            } else if (bIdx >= 0) {
                sum += Character.getNumericValue(bChars[bIdx]);
            }
            overflow = sum / 2;
            sb.insert(0, sum % 2);
            idx++;
            aIdx = aLen - idx;
            bIdx = bLen - idx;
        }
        return sb.toString();
    }

}
