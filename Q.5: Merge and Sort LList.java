import java.util.List;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val=val;
        this.next=null;
    }
}
public class MergeSortLList {
    public static ListNode merge(ListNode l1,ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        while(l1 !=null && l2!=null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        if(l1!=null) {
            current.next=l1;
        } else {
            current.next=l2;
        }
        return dummy.next;
    }

    public static ListNode sort(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode mid=getMiddle(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        ListNode sortedLeft=sort(left);
        ListNode sortedright=sort(right);
        return merge(sortedLeft,sortedright);
    }
    public static ListNode getMiddle(ListNode head) {
        if(head==null) {
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void printlist(ListNode head) {
        ListNode current=head;
        while (current!=null) {
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode list1=new ListNode(25);
        list1.next=new ListNode(35);
        list1.next.next=new ListNode(12);
        list1.next.next.next=new ListNode(4);
        list1.next.next.next.next=new ListNode(36);
        list1.next.next.next.next.next=new ListNode(48);
        ListNode list2=new ListNode(8);
        list2.next=new ListNode(32);
        list2.next.next=new ListNode(22);
        list2.next.next.next=new ListNode(45);
        list2.next.next.next.next=new ListNode(63);
        list2.next.next.next.next.next=new ListNode(49);
        System.out.println("Linked list1:");
        printlist(list1);
        System.out.println("Linked list2:");
        printlist(list2);
        ListNode mergeList=merge(list1,list2);
        ListNode sortedMergeList=sort(mergeList);
        System.out.println("Sorted merged Limked List: ");
        printlist(sortedMergeList);
    }
}
