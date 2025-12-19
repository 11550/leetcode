package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AddBinaryTest {

    private static Stream<Arguments> addBinary_shouldBeEquals() {
        return Stream.of(
                Arguments.of("11", "1", "100"),
                Arguments.of("1111", "1111", "11110"),
                Arguments.of("1010", "1011", "10101")
        );
    }

    private final AddBinary addBinary = new AddBinary();

    @ParameterizedTest
    @MethodSource
    void addBinary_shouldBeEquals(String a, String b, String expected) {
        assertEquals(expected, addBinary.addBinary(a, b));
    }

}