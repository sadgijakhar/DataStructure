package BST;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class BST {
    static Node root;

    static void search(int x){
        Node loc = null;
        if(root == null){
            System.out.println("Empty Tree");
        }
        else{
            Node temp = root;
            int count = -1;
            while(temp != null){
                if(temp.data == x){
                    loc = temp;
                    System.out.println("Element found at "+loc);
                    count++;
                    break;
                }
                else if(temp.data > x){
                    loc = temp;
                    temp = temp.left;
                }
                else {
                    loc = temp ;
                    temp = temp.right;
                }
            }
            if(count == -1){
                System.out.println("Element not found");
            }
            
        }
        
    }

    static void insert(int data ){
        Node node = new Node(data);
        node.right = null;
        node.left = null;
        if(root == null){
            root = node;
        }
        else{
            Node parent = null;
            Node temp = root;
            while( temp!= null){
                if(temp.data >= data){
                    parent = temp;
                    temp = temp.left;
                }
                else{
                    parent = temp;
                    temp = temp.right;
                }
            }
            if(parent.data >= data){
                parent.left = node;
            }
            else{
                parent.right = node;
            }
        }
    }

    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    static void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    static void DelA(Node loc , Node parent){
        if(root == null){
            System.out.println("Tree is Empty");
        }
        Node child = null;
        if(loc.left != null){
            child = loc.left;
        }
        else if(loc.right != null){
            child = loc.right;
        }
        if(parent.left == loc){
            parent.left = child;
        }
        else{
            parent.right = child;
        }
    }

    static void DelB(Node loc , Node parent){
        if(root == null){
            System.out.println("Empty Tree");
        }
        else{
            Node INS = loc.right;
            Node INSpar = loc;

            while(INS.left != null){
                INSpar = INS;
                INS = INS.left;
            }

            DelA(INS, INSpar);
            INS.left = loc.left;
            INS.right = loc.right;

            if(root == loc){
                root = INS;
            }
            else if(parent.left == loc){
                parent.left = INS;
            }
            else{
                parent.right = INS;
            }
        }
    }

    static void Delete(int x){
        if(root == null){
            System.out.println("Tree is Empty");
        }
        else{
            Node loc = null;
            Node parent = root;
            Node temp = root;
            while(temp != null){
                if(temp.data == x){
                    loc = temp;
                    break;
                }
                else if(temp.data > x){
                    parent = temp; 
                    temp = temp.left;
                }
                else{
                    parent = temp;
                    temp = temp.right;
                }
            }
            if(loc.left != null && loc.right != null){
                DelB(loc, parent);
            }
            else{
                DelA(loc, parent);
            }
        }
    }
    public static void main(String[] args) {
        insert(1);
        insert(0);
        insert(3);
        insert(2);
        insert(4);

        search(9);
        Delete(1);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
}
