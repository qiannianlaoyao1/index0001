import java.util.List;

// class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//class Solution {
//
//    public static int val = 0;
//    public static int ans = -1;
//
//    public static void sss(TreeNode root,int k){
//
//        if (root == null) {
//            return;
//        }
//        sss(root.left,k);
//        val++;
//        if(val == k){
//            ans = root.val;
//            return ;
//        }
//        sss(root.right,k);
//
//    }
//
//    public int kthSmallest(TreeNode root, int k) {
//        val = 0;
//        sss(root,k);
//        return ans;
//    }
//}
