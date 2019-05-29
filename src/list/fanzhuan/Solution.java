package list.fanzhuan;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class Solution {
    
    public ListNode p = null;
    
    public ListNode get(ListNode head){
        if(head == null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode q = get(head.next);
        if(p==null){
            p = q;
        }
        q.next = head;
        head.next = null;
        return head;
    }
    
    public ListNode ReverseList(ListNode head) {
        p = null; 
        get(head);
        return p;
    }
}