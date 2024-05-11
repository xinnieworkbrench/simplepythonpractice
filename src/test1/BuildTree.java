package test1;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTree {

    public static void main(String[] args){

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node1.leftSubTree = node2;
        node1.rightSubTree = node3;

        node2.leftSubTree = node4;
        node2.rightSubTree = node5;

        node3.leftSubTree = node6;
        node3.rightSubTree = node7;

        //preorderTraverse(node1);

        inorderTraverse(node1);
    }

     public static void breadthFirstTraverse(TreeNode root){
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);

         while(!queue.isEmpty()){
             TreeNode cur = queue.poll();
             System.out.println(cur.value);

             if(cur.leftSubTree != null){
                 queue.add(cur.leftSubTree);
             }
             if(cur.rightSubTree != null){
                 queue.add(cur.rightSubTree);
             }

         }

     }

    public static void preorderTraverse(TreeNode root){
        if(root == null){
             return;
        }
        System.out.println(root.value);
        preorderTraverse(root.leftSubTree);
        preorderTraverse(root.rightSubTree);
    }
    public static void inorderTraverse(TreeNode root){
        if(root == null){
            return;
        }
        preorderTraverse(root.leftSubTree);
        System.out.println(root.value);
        preorderTraverse(root.rightSubTree);

    }

}
