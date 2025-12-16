package easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ValidParenthesesTest {

    private static Stream<Arguments> isValid_shouldBeEquals() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(}", false),
                Arguments.of("([])", true),
                Arguments.of("([)]", false)
        );
    }

    private final ValidParentheses validParentheses = new ValidParentheses();

    @ParameterizedTest
    @MethodSource
    void isValid_shouldBeEquals(String input, boolean expected) {
        assertEquals(expected, validParentheses.isValid(input));
    }

}