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
    
        public static int Size(ListNode head) {
            ListNode current=head;
            int size=0;
            while(current!=null) {
                current=current.next;
                size++;
            }
            return size;
        }
        public ListNode reverseKGroup(ListNode head, int k) {
            if(Size(head)<k) {
            return head;
        }
        if(head==null||head.next==null) {
            return head;
        }
        int count=0;
        ListNode current=head;
        ListNode prev=null;
        ListNode Next_node=null;
        while(current!=null && count<k) {
            Next_node=current.next;
            current.next=prev;
            prev=current;
            current=Next_node;
            count++;
        }
        if(Next_node!=null) {
            head.next=reverseKGroup(Next_node,k);
        }
        return prev;
    }
}
