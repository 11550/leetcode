package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LengthOfLastWordTest {

    private static Stream<Arguments> searchInsert_shouldBeEquals() {
        return Stream.of(
                Arguments.of("Hello World", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("a", 1),
                Arguments.of(" a", 1),
                Arguments.of("a ", 1),
                Arguments.of("day    ", 3),
                Arguments.of("day", 3),
                Arguments.of("luffy is still joyboy", 6)
        );
    }

    private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @ParameterizedTest
    @MethodSource
    void searchInsert_shouldBeEquals(String input, int expected) {
        assertEquals(expected, lengthOfLastWord.lengthOfLastWord(input));
    }

}