public class BinaryTreeTraversal{
    public void preorder(Node node){
        if(node){
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }
    
    public void inorder(Node node){
        if(node){
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }
    
    public void postorder(Node node){
        if(node){
            inorder(node.left);
            inorder(node.right);
            System.out.println(node.data);
        }
    }
}

class Node{
    int data;
    Node left;
    Node rigt;
}
