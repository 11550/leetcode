package hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that
 * every character in t (including duplicates) is included in the window. If there is no such substring, return
 * the empty string "".
 *
 * The testcases will be generated such that the answer is unique.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * Example 2:
 *
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 * Example 3:
 *
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 *
 *
 * Constraints:
 *
 * m == s.length
 * n == t.length
 * 1 <= m, n <= 105
 * s and t consist of uppercase and lowercase English letters.
 *
 *
 * Follow up: Could you find an algorithm that runs in O(m + n) time?
 *
 * https://leetcode.com/problems/minimum-window-substring/
 */
class MinimumWindowSubstring {

    //TODO алгоритм слишком медленный, чтобы пройти тест 100000/10000
    public String minWindow(String s, String t) {
        List<Character> target = new ArrayList<>();
        for (char letter : t.toCharArray()) {
            target.add(letter);
        }
        Set<Character> targetSet = new HashSet<>(target);
        StringBuilder sb = new StringBuilder(s);
        String result = window(sb, new ArrayList<>(target), new StringBuilder());
        StringBuilder lastResult = new StringBuilder(result);
        while (!sb.isEmpty()) {
            if (!lastResult.isEmpty()) {
                lastResult.deleteCharAt(0);
            }
            sb.deleteCharAt(0);
            if (sb.isEmpty() || !targetSet.contains(sb.charAt(0))) {
                continue;
            }
            String tmp = window(sb, new ArrayList<>(target), lastResult);
            if (tmp.isEmpty()) {
                break;
            } else if (tmp.length() < result.length()) {
                result = tmp;
                lastResult = new StringBuilder(result);
            }
            if (result.length() == target.size()) {
                break;
            }
        }
        return result;
    }

    public String window(StringBuilder input, List<Character> target, StringBuilder lastResult) {
        for (Character c : lastResult.toString().toCharArray()) {
            target.remove(c);
        }
        if (target.isEmpty()) {
            return lastResult.toString();
        }
        for (int i = lastResult.length(); i < input.length(); i++) {
            target.remove((Character) input.charAt(i));
            if (target.isEmpty()) {
                return input.substring(0, i + 1);
            }
        }
        return "";
    }

}
