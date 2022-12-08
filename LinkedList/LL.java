package LinkedList;

public class LL {
    Node head;
    class Node {
        Node next;
        int data;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void fpush(int data){
        Node new_node= new Node(data);
        new_node.next= head;
        head=new_node;
    }
    public void lpush(int data){
        Node new_node=new Node(data);
        Node p=head;
        if(p==null){
            p=new_node;
        }
        while(p.next!=null){
            p=p.next;
        }
        p.next=new_node;
    }
    public void push(int data, int pos){
        Node new_node=new Node(data);
        int po=0;
        Node p= head;
        while(p.next!=null && po<pos){
            p=p.next;
        }
        new_node.next=p.next;
        p.next= new_node;
    }
    public void llprint(){
        Node p=head;
        while(p!=null){
            System.out.print(p.data+"->");
            p=p.next;
        }
    }
    public void split(LL list){
        LL odd= new LL();
        LL even= new LL();
        Node start=list.head;
        if(start==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        while (start!=null){
            if(start.data%2==0){
                even.fpush(start.data);
            }
            else{
                odd.fpush(start.data);
            }
            start=start.next;
        }
        Node ev= even.head;
        Node od= odd.head;
        while(ev!=null){
            System.out.print(ev.data+"->");
            ev=ev.next;
        }
        System.out.println();
        while(od!=null){
            System.out.print(od.data+"->");
            od=od.next;
        }

    }
    public static void main(String[] args) {
        LL list1= new LL();
        list1.fpush(7);
        list1.fpush(4);
        list1.fpush(2);
        list1.fpush(9);
        list1.fpush(6);
        list1.fpush(10);
        list1.lpush(5);
        list1.lpush(3);
        list1.lpush(17);
        list1.llprint();
        System.out.println();
        list1.split(list1);

    }
}