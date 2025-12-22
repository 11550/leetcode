package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ClimbingStairsTest {

    private static Stream<Arguments> climbStairs_shouldBeEquals() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(4, 5),
                Arguments.of(5, 8),
                Arguments.of(6, 13),
                Arguments.of(7, 21),
                Arguments.of(8, 34),
                Arguments.of(9, 55),
                Arguments.of(45, 1836311903)
        );
    }

    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @ParameterizedTest
    @MethodSource
    void climbStairs_shouldBeEquals(int input, int expected) {
        assertEquals(expected, climbingStairs.climbStairs(input));
    }

}