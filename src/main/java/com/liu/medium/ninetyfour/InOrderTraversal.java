package com.liu.medium.ninetyfour;


import java.util.ArrayList;
import java.util.List;
//递归方法
public class InOrderTraversal {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left = new TreeNode(1);
        InOrderTraversal a = new InOrderTraversal();
        List<Integer> b = a.inorderTraversal(head);
        System.out.println(b.get(0));
        System.out.println(b.get(1));
        System.out.println(b.get(2));
    }
    List<Integer> a = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        test(root);
        return a;
    }

    public void test(TreeNode root){
        if(root != null){
            if(root.left != null){
                test(root.left);
            }
            a.add(root.val);
            if(root.right != null){
                test(root.right);
            }
        }
    }
}
class TreeNode {
    int val;
    TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
}
