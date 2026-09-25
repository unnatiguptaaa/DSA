/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {

        // Step 1: Reverse the linked list
        head = reverse(head);

        int max = 0;
        ListNode curr = head;
        ListNode prev = null;

        // Step 2: Remove nodes smaller than maximum
        while (curr != null) {

            if (curr.val < max) {
                // Remove current node
                prev.next = curr.next;
            } else {
                // Keep current node
                max = curr.val;
                prev = curr;
            }

            curr = curr.next;
        }

        // Step 3: Reverse again
        return reverse(head);
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}