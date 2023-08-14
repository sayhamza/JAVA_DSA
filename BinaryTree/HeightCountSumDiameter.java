package BinaryTree;

public class HeightCountSumDiameter {

    static class Node{
        int data;
        Node left;
        Node right;
        
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //Tree Height
    public static int height(Node root){
        if (root==null) {
           return 0; 
        }

        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }

    //Count of Nodes
    public static int count(Node root){
        if (root==null) {
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }

    //Sum of Nodes
    public static int sum(Node root){
        if (root==null) {
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;
    }

    //Diameter of Nodes
    public static int diameter2(Node root){ //O(n^2)
        if (root==null) {
            return 0;
        }
        int ld=diameter2(root.left);
        int lh=height(root.left);
        int rd=diameter2(root.right);
        int rh=height(root.right);

        int selfdiam=lh+rh+1;

        return Math.max(selfdiam, Math.max(ld, rd));
    }
    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }

    public static Info diameter(Node root){ //O(n)
         if (root==null) {
            return new Info(0,0);
        }
        Info li=diameter(root.left);
        Info ri=diameter(root.right);

        int diam= Math.max(Math.max(li.diam, ri.diam),li.ht+ri.ht+1);
        int ht= Math.max(li.ht, ri.ht)+1;

        return new Info(diam, ht);
    }
        
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5); 
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(height(root));
        
        System.out.println(count(root));

        System.out.println(sum(root));

        System.out.println(diameter2(root));

        System.out.println(diameter(root).diam);
    }
    
}
