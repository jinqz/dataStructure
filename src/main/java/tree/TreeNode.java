package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树的先序遍历，中序遍历，后序遍历递归版和非递归版
 * 二叉树的层次遍历
 * 二叉树的高度
 * Created by Administrator on 2016/10/8.
 */
public class TreeNode {
    private int value;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public static int getTreeDeep(TreeNode node){
        if(node == null){
            return 0;
        }else {
            int i = getTreeDeep(node.getLeftChild());
            int j = getTreeDeep(node.getRightChild());
            return  (i > j) ? (i + 1) : (j + 1);
        }
    }

    public static void visit(TreeNode node){
        if(node != null){
            System.out.print(node.getValue());
        }
    }

    public static void preOrder(TreeNode node){
        if(node != null){
            visit(node);
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    public static void inOrder(TreeNode node){
        if(node != null){
            inOrder(node.getLeftChild());
            visit(node);
            inOrder(node.getRightChild());
        }
    }

    public static void postOrder(TreeNode node){
        if(node != null){
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            visit(node);
        }
    }

    public static void preOrderNotRec(TreeNode node){
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        TreeNode n = node;
        while (n != null || !nodes.isEmpty()){
            if(n != null){
                visit(n);
                nodes.push(n);
                n = n.getLeftChild();
            }else {
                n = nodes.pop();
                n = n.getRightChild();
            }
        }
    }

    /**
     * 后序遍历的逆序就是先序遍历的第二步和第三步交换一下顺序
     * @param node
     */
    public static void inOrderNotRec(TreeNode node){
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        TreeNode n = node;
        while (n != null || nodes.size() > 0){
            if(n != null){
                nodes.push(n);
                n = n.getLeftChild();
            }else {
                n = nodes.pop();
                visit(n);
                n = n.getRightChild();
            }
        }
     }
    public static void postOrderNotRec(TreeNode node){
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        Stack<TreeNode> outPut = new Stack<TreeNode>();
        TreeNode n = node;
        while (n != null || nodes.size() > 0){
            if(n != null){
                outPut.push(n);
                nodes.push(n);
                n = n.getRightChild();
            }else {
                n = nodes.pop();
                n = n.getLeftChild();
            }
        }
        while (outPut.size() > 0){
            visit(outPut.pop());
        }
    }

    /**
     * 层次遍历
     * @param node
     */
    public static void sequenceOrder(TreeNode node){
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        TreeNode n = node;
        nodes.add(n);
        while (nodes.size() > 0){
            n = nodes.poll();
            visit(n);
            if(n.getLeftChild() != null){
                nodes.add(n.getLeftChild());
            }
            if(n.getRightChild() != null){
                nodes.add(n.getRightChild());
            }
        }
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        root.setLeftChild(n2);
        root.setRightChild(n3);
        n2.setLeftChild(n4);
        n2.setRightChild(null);
        n4.setLeftChild(null);
        n4.setRightChild(null);
        n3.setLeftChild(n5);
        n3.setRightChild(n6);
        n5.setLeftChild(null);
        n5.setRightChild(null);
        n6.setLeftChild(null);
        n6.setRightChild(n7);
        n7.setLeftChild(null);
        n7.setRightChild(null);

        /*preOrder(root);
        System.out.println();
        preOrderNotRec(root);*/

        /*inOrder(root);
        System.out.println();
        inOrderNotRec(root);*/

        /*postOrder(root);
        System.out.println();
        postOrderNotRec(root);*/

        /*sequenceOrder(root);*/

        System.out.println(getTreeDeep(root));

    }
}
