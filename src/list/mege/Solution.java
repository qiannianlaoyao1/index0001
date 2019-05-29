package list.mege;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {

    public static ListNode getMid(ListNode head, ListNode end) {

        if(head == end ){
            return head;
        }

        ListNode p1 = head;
        ListNode p2 = head;

        while (p1.next != end && p2.next != end && p2.next.next!=end) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

    public void meger(ListNode head,ListNode end){
        if(head==end){
            return ;
        }
        ListNode p = getMid(head,end);
        meger(head,p);
        meger(p.next,end);

        sort(head,p,end);
    }

    public void sort(ListNode head,ListNode p,ListNode end){

        ListNode l1 = new ListNode(-1);
        ListNode q1 = l1;
        ListNode head1 = head;
        ListNode l2 = p.next;
        while(head!=p.next&&l2!=end.next){
            if(head.val>l2.val){
                ListNode l3 = new ListNode(l2.val);
                l1.next = l3;
                l1 = l3;
                l2 = l2.next;
            }else{
                ListNode l4 = new ListNode(head.val);
                l1.next = l4;
                l1 = l4;
                head = head.next;
            }
        }
        while(head!=p.next){
            ListNode l3 = new ListNode(head.val);
            l1.next = l3;
            l1 = l3;
            head = head.next;
        }
        while(l2!=end.next){
            ListNode l3 = new ListNode(l2.val);
            l1.next = l3;
            l1 = l3;
            l2 = l2.next;
        }

        q1 = q1.next;
        while(q1!=null){
            head1.val = q1.val;
            head1 = head1.next;
            q1 = q1.next;
        }
    }

    public void sortList(ListNode head,ListNode end) {

        meger(head,end);
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;


        ListNode node = l1;

        new Solution().sortList(l1,l4);

        while (node != null) {
            System.out.println(node.val);
            if (node.next == null) {
                break;
            }
            node = node.next;
        }

    }
}