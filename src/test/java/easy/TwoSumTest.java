package easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSumTest {

    private static Stream<Arguments> twoSumCase_shouldBeEquals() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }

    private final TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @MethodSource
    void twoSumCase_shouldBeEquals(int[] source, int target, int[] expected) {
        int[] actual = twoSum.twoSum(source, target);
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum_shouldThrowException() {
        assertThrows(RuntimeException.class, () -> twoSum.twoSum(new int[]{3, 3}, 9), "There are no results");
    }

}