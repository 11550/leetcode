package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanToIntegerTest {

    private final RomanToInteger romanToInteger = new RomanToInteger();

    @ParameterizedTest
    @CsvSource({
            "III, 3",
            "LVIII, 58",
            "MCMXCIV, 1994"
    })
    void romanToInt(String input, int expected) {
        assertEquals(expected, romanToInteger.romanToInt(input));
    }

}