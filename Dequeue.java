import java.util.Scanner;

public class Dequeue {
    static int front;
    static int rear;
    static int arr[];
    static int size;
    Dequeue(int c){
        size = c ;
        front = -1;
        rear = -1;
        arr = new int[c];
    }

    void insertAtlast(int x){
        if(rear == size-1){
            System.out.println("overflow");
        }
        if(rear == -1){
            rear = 0;
            front = 0;
        }
        else{
            rear++;
        }
        arr[rear] = x;
    }

    void insertatfirst(int x){
        if(rear == size){
            System.out.println("Overflow");
        }
        else{
            for(int i = rear ; i > -1 ; i--){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp; 
            }
            rear++;
            arr[front] = x;
        }
    }
    int removeAtfirst(){
        if(rear==-1){
            System.out.println("underflow");
            return -1;
        }
        int x =0;
        if(rear==front){
            x = arr[rear];
            front=-1;
            rear=-1;
        }
        else{
            x = arr[front];
            front++;
        }
        return x;

    }
    int removeatLast(){
        int x = -1;
        if(front>rear){
            return x;
        }
        else{
            if(rear==0){
                x = arr[rear];
                front=-1;
                rear=-1;
            }
            else{
                x = arr[rear];
                rear--;
            }
            return x;
        }
    }
    void dispaly(){
        for(int i = front; i <rear+1 ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int l= sc.nextInt();
        Dequeue t = new Dequeue(l);
        while(true){
            System.out.println("What do yo want to do with queue?");
            System.out.println("1-insertion at last");
            System.out.println("2-insertion at first");
            System.out.println("3-remove at first");
            System.out.println("4-remove at last");
            System.out.println("5-print");
            System.out.println("Press 6 for Exit");
            int number = sc.nextInt();
            if (number == 1) {
                System.out.println("Enter the number you want to insert");
                int x = sc.nextInt();
                t.insertAtlast(x);
                // System.out.println(Arrays.toString(Queue));
            }
            else if (number == 2) {
                System.out.println("Enter the number you want to insert");
                int x = sc.nextInt();
                t.insertatfirst(x);
            }
            else if (number == 3) {
                int y =t.removeAtfirst();
                if(y == -1){
                    System.out.println("Underflow");
                }
                else{
                    System.out.println("Element popped: "+y);
                }
            }
            else if (number == 4) {
                int y =t.removeatLast();
                if(y == -1){
                    System.out.println("Underflow");
                }
                else{
                    System.out.println("Element popped: "+y);
                }
            }
            else if (number == 5) {
                t.dispaly();
                // System.out.println(Arrays.toString(queue));
            }
            else{
                break;
            }
        }
        sc.close();
    }
}
