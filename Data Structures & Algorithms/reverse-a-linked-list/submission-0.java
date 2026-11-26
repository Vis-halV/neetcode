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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            // Save the link before broking it
            ListNode temp = curr.next;
            // point the head of next to prev  
            curr.next = prev;
            // make the curr node as prev 
            prev = curr;
            // and the next node as prev 
            curr = temp;
        }
        
        return prev;
    }
}
