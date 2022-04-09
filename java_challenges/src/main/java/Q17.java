import java.util.*;
public class Q17 {
    static  class Node{
        public int data;
        public Node left,right;
    };
    static void printLeafNodes(Node root) {
        if (root == null)
            return;
        if(root.left==null&&root.right==null){
            System.out.print(root.data+" ");
            return;
        }
        if(root.right!=null)
            printLeafNodes(root.right);
    }
    static Node newNode(int data){
        Node temp=new Node();
        temp.data=data;
        temp.right=null;
        temp.left=null;
        return temp;
    }
    public static void main(String args[]){
        Node root=newNode(1);
        root.left=newNode(2);
        root.right=newNode(3);
printLeafNodes(root);}}