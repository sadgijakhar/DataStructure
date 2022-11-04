class Node{
    Node head;
    Node next;
    int data;
    Node(int data){
        this.data = data; 
        head = null;
        next = null;
    }
}
public class linkedlistSearch {
    static Node head = null;

    static void InsertionAtFirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    static void insertionAtLast(int data){
        Node newnode = new Node(data);
        newnode.next = null;
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }

    }
    static void InsertionAtMid(int data){
        Node newnode = new Node(data);
        if(head == null){
            newnode.next = null;
            head = newnode;
        }
        else{
            int count = 0 ;
            Node temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            int mid = (count % 2 == 0)?(count/2):(count+1)/2;
            temp = head;
            while(mid-- > 1){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
    static int SearchUnsorted(int x){
        if(head == null){
            return -1;
        }
        else{
            Node temp = head;
            int pos = 0;
            while(temp !=null){
                pos++;
                if(temp.data == x){
                    return pos;
                }
                temp = temp.next;
            }
        }
        return -1;
    }
    static int SearchSorted(int x){
        if(head == null){
            return -1;
        }
        else{
            int pos = 0 ;
            Node temp = head;
            while(temp != null && temp.data <= x){
                pos++;
                System.out.println("Check");
                if(temp.data == x){
                    return pos;
                }
                temp = temp.next;
            }
            return -1;
        }

    }    
    static void delete(int key){
        Node temp = head, prev = null;
  
        // If head node itself holds the key
        // or multiple occurrences of key
        while (temp != null && temp.data == key) 
        {
            head = temp.next; // Changed head
            temp = head; // Change Temp
        }
  
        // Delete occurrences other than head
        while (temp != null) 
        {
            // Search for the key to be deleted,
            // keep track of the previous node
            // as we need to change 'prev->next'
            while (temp != null && temp.data != key) 
            {
                prev = temp;
                temp = temp.next;
            }
  
            // If key was not present in linked list
            if (temp == null)
                return;
  
            // Unlink the node from linked list
            prev.next = temp.next;
  
            // Update Temp for next iteration of outer loop
            temp = prev.next;
        }
    }
    static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertionAtFirst(10);
        // InsertionAtFirst(0);
        // InsertionAtFirst(1);
        // InsertionAtMid(15);
        // InsertionAtMid(15);
        InsertionAtMid(20);
        insertionAtLast(100);
        insertionAtLast(100);
        insertionAtLast(200);
        print();
        // System.out.println(SearchUnsorted(100));
        // System.out.println(SearchSorted(20));
        delete(100);
        print();
    }
}
