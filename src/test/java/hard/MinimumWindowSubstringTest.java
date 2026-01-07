package hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@Disabled
class MinimumWindowSubstringTest {

    private final MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/hard/MinimumWindowSubstringTest.csv",
            numLinesToSkip = 1,
            maxCharsPerColumn = Integer.MAX_VALUE)
    void minWindow_shouldBeEquals(String input, String target, String expected) {
        assertEquals(expected, minimumWindowSubstring.minWindow(input, target));
    }

}