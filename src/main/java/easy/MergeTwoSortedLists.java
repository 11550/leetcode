package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 *----------------------------------------------------------------------------------------------------------------------
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode result = new ListNode();
        ListNode tail = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        }
        if (list2 != null) {
            tail.next = list2;
        }
        return result.next;
    }

    void addTail(ListNode root, ListNode newTail) {
        ListNode tmp = root;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newTail;
    }

    static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode getTail() {
            ListNode tmp = this;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            return tmp;
        }

        ListNode addTail(ListNode newTail) {
            ListNode tmp = this;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newTail;
            return this;
        }

        @Override
        public String toString() {
            List<Integer> result = new ArrayList<>();
            ListNode tmp = this;
            while (tmp != null) {
                result.add(tmp.val);
                tmp = tmp.next;
            }
            return result.toString();
        }

    }

}
