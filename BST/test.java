package BST;

public class test {
    class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            right = null;
            left = null;
        }
    }
    static Node root;

    public void insert(int data){
        root = insertRec(root,data);
    }

    public Node insertRec(Node root , int data) {
        if(root == null){
            root = new Node(data);
        }
        else if(root.data>data){
           root.left = insertRec(root.left, data);
        }
        else{
            root.right = insertRec(root.right, data);
        }
        return root;
    } 
    static void preorder(Node root){
        if(root == null){
            return;
        }
        
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root == null){
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    public void delete(int key){
        root = deleteRec(root , key);
    }
    public Node deleteRec(Node root , int key){
        if(root == null){
            return root;
        }
        else if(root.data >key){
            root.left = deleteRec(root.left , key);
        }
        else if(root.data <key){
            root.right = deleteRec(root.right , key);
        }
        else{
            if (root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                root.data = this.successor(root.right);
                root.right = deleteRec(root.right, root.data);
            }
            
        }
        return root;
    }
    public int successor(Node root){
        int min = root.data;
        Node temp = root;
        while(root.left != null){
            min = temp.data;
            temp = temp.left;
        }
        return min;
    }
    public static void main(String[] args) {
        test tree = new test();
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);

    }
}
