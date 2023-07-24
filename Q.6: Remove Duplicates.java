import java.util.List;

class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val=val;
            this.next=null;
        }
    }
public class RemoveDuplicates {
        public static ListNode remove(ListNode head) {
            if(head==null) {
                return null;
            }
            ListNode current=head;
            while (current!=null) {
                ListNode temp=current;
                while (temp.next!=null) {
                    if(temp.next.val==current.val) {
                        temp.next=temp.next.next;
                    } else {
                        temp=temp.next;
                    }
                }
                current=current.next;
            }
            return head;
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
        ListNode list=new ListNode(2);
        list.next=new ListNode(5);
        list.next.next=new ListNode(12);
        list.next.next.next=new ListNode(2);
        list.next.next.next.next=new ListNode(3);
        list.next.next.next.next.next=new ListNode(5);
        list.next.next.next.next.next.next=new ListNode(1);
        list.next.next.next.next.next.next.next=new ListNode(2);
        list.next.next.next.next.next.next.next.next=new ListNode(5);
        list.next.next.next.next.next.next.next.next.next=new ListNode(5);
        System.out.println("Linked list before removing duplicates ");
        printlist(list);
        ListNode withoutDupli=remove(list);
        System.out.println("Linked list after removing duplicates ");
        printlist(withoutDupli);
    }
}
