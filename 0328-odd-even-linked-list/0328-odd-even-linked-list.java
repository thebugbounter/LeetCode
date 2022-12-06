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
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode o = odd;
        ListNode e = even;
        int i = 1;
        while (head != null) {
            if (i % 2 != 0) {
                o.next = head;
                o = head;
            }
            else {
                e.next = head;
                e = head;
            }
            head = head.next;
            i ++;
        }
        e.next = null;
        o.next = even.next;
        return odd.next;
    }
}