package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestCommonPrefixTest {

    private static Stream<Arguments> longestCommonPrefix_shouldBeEquals() {
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"flower","f","flight"}, "f"),
                Arguments.of(new String[]{"dog","racecar","car"}, "")
        );
    }

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @ParameterizedTest
    @MethodSource
    void longestCommonPrefix_shouldBeEquals(String[] input, String expected) {
        assertEquals(expected, longestCommonPrefix.longestCommonPrefix(input));
    }

}