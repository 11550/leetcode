package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveElementTest {

    private static Stream<Arguments> removeElement_shouldBeEquals() {
        return Stream.of(
                Arguments.of(new int[]{3,2,2,3}, 3, 2),
                Arguments.of(new int[]{0,1,2,2,3,0,4,2}, 2, 5)
        );
    }

    private final RemoveElement removeElement = new RemoveElement();

    @ParameterizedTest
    @MethodSource
    void removeElement_shouldBeEquals(int[] source, int target, int expected) {
        assertEquals(expected, removeElement.removeElement(source, target));
    }

}