package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SearchA2DMatrixTest {
    
    private static Stream<Arguments> setZeroes_shouldBeEquals() {
        return Stream.of(
                Arguments.of(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3, true),
                Arguments.of(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13, false)
        );
    }

    private final SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();

    @ParameterizedTest
    @MethodSource
    void setZeroes_shouldBeEquals(int[][] input, int target, boolean expected) {
        assertEquals(expected, searchA2DMatrix.searchMatrix(input, target));
    }

}