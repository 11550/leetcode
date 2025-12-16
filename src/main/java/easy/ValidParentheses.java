package easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 * Example 5:
 *
 * Input: s = "([)]"
 *
 * Output: false
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
class ValidParentheses {

    private static final Map<Character, Character> CONVERTER;

    static {
        Map<Character, Character> tmp = new HashMap<>();
        tmp.put('(', ')');
        tmp.put('[', ']');
        tmp.put('{', '}');
        CONVERTER = Collections.unmodifiableMap(tmp);
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> stack1 = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty() && Objects.equals(c, CONVERTER.get(stack.peek()))) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            Character pop = stack.pop();
            Character peek = CONVERTER.get(stack.peek());
            if (Objects.equals(peek, pop)) {
                stack.pop();
            } else if (!stack1.isEmpty() && Objects.equals(peek, stack1.peek())) {
                stack.pop();
                stack1.pop();
            } else {
                stack1.push(pop);
            }
        }
        return stack1.isEmpty();
    }

}
