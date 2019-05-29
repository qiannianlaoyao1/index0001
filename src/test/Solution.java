package test;

import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
    this.val = val;

    }
}
public class Solution {




    public void Mirror(TreeNode root) {
        if(root == null){
            return ;
        }
        TreeNode t1 = root.left;
        TreeNode t2 = root.right;
        root.right = t1;
        root.left = t2;
        Mirror(t1);
        Mirror(t2);
    }

    //8,8,7,9,2,#,#,#,#,4,7},{8,9,2}
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(10);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(7);
        TreeNode t6 = new TreeNode(9);
        TreeNode t7 = new TreeNode(11);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t3.left = t6;
        t3.right = t7;

        TreeNode tt2 = t2;
        t2 = t3;
        t3 = tt2;

        TreeNode tt1 = t1;

        new Solution().Mirror(t1);


        Queue<TreeNode> q = new LinkedList<>();
        q.offer(tt1);
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(t!=null) {
                System.out.println(t.val);
                q.offer(t.left);
                q.offer(t.right);
            }
        }

    }

}