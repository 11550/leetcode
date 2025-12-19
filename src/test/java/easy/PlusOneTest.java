package easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PlusOneTest {

    private static Stream<Arguments> plusOne_shouldBeEquals() {
        return Stream.of(
                Arguments.of(new int[]{8,9,9}, new int[]{9,0,0}),
                Arguments.of(new int[]{9,9}, new int[]{1,0,0}),
                Arguments.of(new int[]{1,2,3}, new int[]{1,2,4}),
                Arguments.of(new int[]{4,3,2,1}, new int[]{4,3,2,2}),
                Arguments.of(new int[]{9}, new int[]{1,0})
        );
    }

    private final PlusOne plusOne = new PlusOne();

    @ParameterizedTest
    @MethodSource
    void plusOne_shouldBeEquals(int[] source, int[] expected) {
        assertArrayEquals(expected, plusOne.plusOne(source));
    }

}