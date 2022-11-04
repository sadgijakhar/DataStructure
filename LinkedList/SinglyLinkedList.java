package LinkedList;

// import java.util.Scanner;

public class SinglyLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null; 
        }
    }
    static Node head;
    void addFirst(int num){
        Node node = new Node(num);
        node.next = head;
        head = node;
    }
    void addLast(int num){
        Node node = new Node(num);
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    void addMid(int num){
        Node node = new Node(num);
        node.next = null;
        if(head == null){
            node.next = head;
            head = node;
        }
        else{
            Node temp = head;
            int length = 0;
            while(temp != null){
                temp = temp.next;
                length++;
            }
            int count = (length % 2 == 0)?(length/2):(length+1)/2;
            temp = head;
            while(count-- > 1){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }
    void deleteFirst(){
        Node temp = head;
        temp.next = head.next;
        head = temp.next;
    }
    void deleteLast(){
        Node temp = head ;
        if(temp.next == null){
            head = null;
        }
        else{
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        
    }
    void deleteMid(){
        Node temp = head;
        if(head.next == null){
            head = null;
        }
        else{
            int l = 0;
            while(temp != null){
                temp = temp.next;
                l++;
            }
            int count = l%2==0?l/2:(l+1)/2;
            temp = head;
            while(count-- > 2){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            

        }
    }
    void deleteAtGivenIndex(int key){
        Node temp = head;
        Node pointer= null;
        if(temp != null && temp.data == key){
            head = temp.next;
        }
        else{
            while(temp.data != key && temp != null){
                pointer = temp;
                temp = temp.next;
            }
            pointer.next = temp.next;
        }
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList ls = new SinglyLinkedList();
        ls.addFirst(3);
        ls.addFirst(4);
        ls.addLast(1);
        ls.addFirst(5);
        ls.addMid(2);
        ls.addFirst(3);
        ls.addFirst(4);
        ls.addLast(1);
        ls.addFirst(5);
        ls.addMid(2);
        ls.deleteLast();
        ls.deleteFirst();
        ls.deleteMid();
        ls.deleteAtGivenIndex(4);
        ls.deleteAtGivenIndex(2);
        ls.deleteAtGivenIndex(2);
        ls.print();
    }
}