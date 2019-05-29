package list.quick;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution {


     public static void qsort(ListNode node,ListNode en){

         if(node == en || node == null){
             return ;
         }
         ListNode p;
         p = quick(node,en);
         qsort(node,p);
         qsort(p.next,en);
     }

    public static ListNode quick(ListNode node,ListNode en){
        int val = node.val;
        ListNode i = node;
        if(node.next == null) {
            return node;
        }
        ListNode j = node.next;
        while(j!=en&&i!=en){
            if(j.val>val){
                j = j.next;
            }else {
                i = i.next;
                int x;
                x = i.val;
                i.val = j.val;
                j.val = x;
                j = j.next;
            }
        }
        int x = i.val;
        i.val = val;
        node.val = x;
        return i;
    }

    public ListNode sortList(ListNode head) {
        ListNode en = null;
        qsort(head,en);

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode node = new Solution().sortList(l1);

        while(node!=null){
            System.out.println(node.val);
            if(node.next==null){
                break;
            }
            node = node.next;
        }

    }
}