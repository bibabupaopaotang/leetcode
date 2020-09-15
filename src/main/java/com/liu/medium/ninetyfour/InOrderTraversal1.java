package com.liu.medium.ninetyfour;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//非递归 使用栈的先进后出
public class InOrderTraversal1 {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left = new TreeNode(1);
        InOrderTraversal1 a = new InOrderTraversal1();
        List<Integer> b = a.inorderTraversal(head);
        System.out.println(b.get(0));
        System.out.println(b.get(1));
        System.out.println(b.get(2));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<Integer>();
        Deque<TreeNode> stack = new LinkedList<>();
        //root 和 栈有一个不为空那就说明 还有树节点没有被加载到list当中
        while(root != null || !stack.isEmpty()){
            /**先把看成一个整体树 只有根节点 左子树 右子树
             * 中序遍历 那么就先把根节点放入栈中 然后 左子节点
             * 然后取出 那么就是左子节点 根节点
             * 想象栈为空 那么放入右子节点 再取出
            */
            while(root != null){

                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            a.add(root.val);
            root = root.right;
        }
        return a;
    }

}

