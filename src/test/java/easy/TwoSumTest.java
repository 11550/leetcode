package easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void twoSumCase1() {
        // case 1 nums = [2,7,11,15], target = 9
        int[] case1 = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] expected1 = {0, 1};
        Arrays.sort(case1);
        Arrays.sort(expected1);
        assertArrayEquals(case1, expected1);
    }

    @Test
    void twoSumCase2() {
        // case 2 nums = [3,2,4], target = 6
        int[] case2 = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        int[] expected2 = {1, 2};
        Arrays.sort(case2);
        Arrays.sort(expected2);
        assertArrayEquals(case2, expected2);
    }

    @Test
    void twoSumCase3() {
        // case 3 nums = [3,3], target = 6
        int[] case3 = twoSum.twoSum(new int[]{3, 3}, 6);
        int[] expected3 = {0, 1};
        Arrays.sort(case3);
        Arrays.sort(expected3);
        assertArrayEquals(case3, expected3);
    }

    @Test
    void twoSum_shouldThrowException() {
        assertThrows(RuntimeException.class, () -> twoSum.twoSum(new int[]{3, 3}, 9), "There are no results");
    }

}