package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SqrtTest {

    private static Stream<Arguments> mySqrt_shouldBeEquals() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(4, 2),
                Arguments.of(8, 2),
                Arguments.of(9, 3),
                Arguments.of(16, 4),
                Arguments.of(25, 5),
                Arguments.of(48, 6),
                Arguments.of(49, 7),
                Arguments.of(2147483647, 46340)
        );
    }

    private final Sqrt sqrt = new Sqrt();

    @ParameterizedTest
    @MethodSource
    void mySqrt_shouldBeEquals(int input, int expected) {
        assertEquals(expected, sqrt.mySqrt(input));
    }

}