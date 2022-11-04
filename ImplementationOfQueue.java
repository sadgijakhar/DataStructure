import java.util.Scanner;

public class ImplementationOfQueue {
    static int queue[];
    static int rear ;
    static int front;
    static int size;
    ImplementationOfQueue(int c){
        front = -1;
        rear = -1;
        size = c;
        queue = new int[size];
    }
     void INQUE( int x){
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
        queue[rear] = x;
        
    }
    public int DEQUE(){
        if(rear==-1){
            System.out.println("underflow");
            return -1;
        }
        int x =0;
        if(rear==front){
            x = queue[rear];
            front=-1;
            rear=-1;
        }
        else{
            x = queue[front];
            front++;
        }
        return x;

    }
    static void print(){
        for (int i = front ; i <=rear ; i++){
            System.out.print(queue[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int l= sc.nextInt();
        ImplementationOfQueue t = new ImplementationOfQueue(l);
        while(true){
            System.out.println("What do yo want to do with queue?");
            System.out.println("1-insertion");
            System.out.println("2-deletion");
            System.out.println("3-print");
            System.out.println("Press 4 for Exit");
            int number = sc.nextInt();
            if (number == 1) {
                System.out.println("Enter the number you want to insert");
                int x = sc.nextInt();
                t.INQUE(x);
                // System.out.println(Arrays.toString(Queue));
            }
            else if (number == 2) {
                int y =t.DEQUE();
                if(y == -1){
                    System.out.println("Underflow");
                }
                else{
                    System.out.println("Element popped: "+y);
                }
            }
            else if (number == 3) {
                print();
                // System.out.println(Arrays.toString(queue));
            }
            else{
                break;
            }
        }
        sc.close();

    }
}