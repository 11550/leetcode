package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveDuplicatesFromSortedArrayTest {

    private static Stream<Arguments> removeDuplicates_shouldBeEquals() {
        return Stream.of(
                Arguments.of(new int[]{1,1,2}, 2),
                Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4}, 5)
        );
    }

    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @ParameterizedTest
    @MethodSource
    void removeDuplicates_shouldBeEquals(int[] input, int expected) {
        assertEquals(expected, removeDuplicatesFromSortedArray.removeDuplicates(input));
    }

}