package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    private static Stream<Arguments> strStr_shouldBeEquals() {
        return Stream.of(
                Arguments.of("sadbutsad", "sad", 0),
                Arguments.of("leetcode", "leeto", -1)
        );
    }

    private final FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString =
            new FindTheIndexOfTheFirstOccurrenceInAString();

    @ParameterizedTest
    @MethodSource
    void strStr_shouldBeEquals(String haystack, String needle, int expected) {
        assertEquals(expected, findTheIndexOfTheFirstOccurrenceInAString.strStr(haystack, needle));
    }

}