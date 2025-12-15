package easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeNumberTest {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @ParameterizedTest
    @ValueSource(ints = {1, 121, 100202001})
    void isPalindrome_shouldReturnTrue(int arg) {
        assertTrue(palindromeNumber.isPalindrome(arg));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 1231, 1002032001})
    void isPalindrome_shouldReturnFalse(int arg) {
        assertFalse(palindromeNumber.isPalindrome(arg));
    }

}