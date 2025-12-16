package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import easy.MergeTwoSortedLists.ListNode;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MergeTwoSortedListsTest {

    private static Stream<Arguments> mergeTwoLists_shouldBeEquals() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 4), List.of(1, 3, 4), List.of(1, 1, 2, 3, 4, 4)),
                Arguments.of(List.of(), List.of(), List.of()),
                Arguments.of(List.of(), List.of(0), List.of(0))
        );
    }

    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @ParameterizedTest
    @MethodSource
    void mergeTwoLists_shouldBeEquals(List<Integer> list1, List<Integer> list2, List<Integer> expected) {
        ListNode listNode1 = list1.stream().map(ListNode::new).reduce(new ListNode(), ListNode::addTail);
        ListNode listNode2 = list2.stream().map(ListNode::new).reduce(new ListNode(), ListNode::addTail);
        ListNode result = mergeTwoSortedLists.mergeTwoLists(listNode1.next, listNode2.next);
        String actual = Optional.ofNullable(result).map(ListNode::toString).orElseGet(() -> List.of().toString());
        assertEquals(expected.toString(), actual);
    }

}