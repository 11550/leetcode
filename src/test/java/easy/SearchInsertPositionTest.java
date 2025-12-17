package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SearchInsertPositionTest {

    private static Stream<Arguments> searchInsert_shouldBeEquals() {
        return Stream.of(
                Arguments.of(new int[]{1,3,5,6}, 5, 2),
                Arguments.of(new int[]{1,3,5,6}, 2, 1),
                Arguments.of(new int[]{1}, 0, 0),
                Arguments.of(new int[]{1,3,5}, 5, 2),
                Arguments.of(new int[]{1,3,5}, 4, 2),
                Arguments.of(new int[]{1,3,5,6}, 0, 0),
                Arguments.of(new int[]{1,3,5,6}, 7, 4)
        );
    }

    private final SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @ParameterizedTest
    @MethodSource
    void searchInsert_shouldBeEquals(int[] source, int target, int expected) {
        assertEquals(expected, searchInsertPosition.searchInsert(source, target));
    }

}