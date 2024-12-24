package Decode.java.Mohak.AdvanceDSA;
class Node{
    Node left;
    Node right;
    Integer val;
    Node(int val){
        this.val=val;
        left=null;
        right=null;
    }
}
public class BinaryTree {
    private Node root=null;
    public void add(int a){

    }

}
class Test{

    public static void print(Node a){
        if(a==null){
            return;
        }
        print(a.left);
        System.out.println(a.val);
        print(a.right);
    }

    public static int sumOfTree(Node a){
        if(a==null){
            return 0;
        }
       return a.val+sumOfTree(a.right)+sumOfTree(a.left);
    }
    public static int productOfTree(Node a){
        if(a==null){
            return 1;
        }
        return a.val*productOfTree(a.right)*productOfTree(a.left);
    }
    public static int productOfNonZeroTree(Node a){
        if(a==null){
            return 1;
        }
        if(a.val==0){
            return productOfNonZeroTree(a.right)*productOfNonZeroTree(a.left);
        }
        else{
            return a.val*productOfNonZeroTree(a.right)*productOfNonZeroTree(a.left);
        }
    }
    public static int maxTree(Node a){
        if(a==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(a.val,Math.max(maxTree(a.left),maxTree(a.right)));
    }
    public static int minTree(Node a){
        if(a==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(a.val,Math.min(minTree(a.left),minTree(a.right)));
    }
    public static int size(Node a){
        if(a==null){
            return 0;
        }
        return 1+size(a.left)+size(a.right);
    }
    public static int levels(Node a){
        if(a==null){
            return 0;
        }
        return 1+Math.max(levels(a.left),levels(a.right));
    }

    public static void main(String[] args) {
        Node a=new Node(-1);
        Node b=new Node (3);
        Node c=new Node(2);
        Node d=new Node (4);
        Node e=new Node(8);
        Node f=new Node (-2);
        Node g=new Node(9);
        Node h=new Node (6);
        a.left=b;a.right=e;
        b.left=c;b.right=d;
        e.left=f;e.right=g;
        f.left=h;
        System.out.println(sumOfTree(a));
        System.out.println(productOfTree(a));
        System.out.println(productOfNonZeroTree(a));
        System.out.println(maxTree(a));
        System.out.println(minTree(a));
        System.out.println(size(a));
        System.out.println(levels(a));
        ;
    }
}
