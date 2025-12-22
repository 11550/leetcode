package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SimplifyPathTest {

    private static Stream<Arguments> simplifyPath_shouldBeEquals() {
        return Stream.of(
                Arguments.of("/home/", "/home"),
                Arguments.of("/home//foo/", "/home/foo"),
                Arguments.of("/home/user/Documents/../Pictures", "/home/user/Pictures"),
                Arguments.of("/../", "/"),
                Arguments.of("/a/./b/../../c/", "/c"),
                Arguments.of("/a//b////c/d//././/..", "/a/b/c"),
                Arguments.of("/.../a/../b/c/../d/./", "/.../b/d")
        );
    }

    private final SimplifyPath simplifyPath = new SimplifyPath();

    @ParameterizedTest
    @MethodSource
    void simplifyPath_shouldBeEquals(String input, String expected) {
        assertEquals(expected, simplifyPath.simplifyPath(input));
    }

}