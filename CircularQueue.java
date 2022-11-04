import java.util.Scanner;    
public class CircularQueue {
    int front ;
    int rear;
    int n ;
    CircularQueue(int n){
        this.front = -1;
        this.rear =-1;
        this.n=n;
    }
    
    void Insert(int Q[], int x , int size){
        if(front == (rear+1)%size){
            System.out.println("overflow");
        }
        else if(rear == -1){
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear+1)%size;
        }
        Q[rear] = x;
    }
    int Deletion(int arr[] ,int size){
        int a = 0;
        if(front == -1){
            System.out.println("Underflow");
        }
        
        else if(rear == front){
            front = -1 ;
            rear = -1;
        }
        else{
            a = arr[front];
            front = (front+1)%size;
        }
        return a;
        
    }
    void print(int arr[],int n){
        if(front == -1){
            System.out.println("Queue is Empty");
        }
        else if (front <=rear){
            for (int i = front ; i <= rear ; i++){
                System.out.print(arr[i]+ " ");
            }
        }
        else{
            for (int i = front ; i < n;i++){
                System.out.print(arr[i]+" ");
            }
            for(int j = 0 ; j <= rear ; j++){
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CircularQueue q = new CircularQueue(n);
        int arr[] = new int[n];
        while(n > 0){
            System.out.println("Press 1 for Insert");
            System.out.println("Press 2 for Delete");
            System.out.println("Press 3 for print");
            System.out.println("Press 4 for exit");
            int a = sc.nextInt();
            if(a == 1){
                System.out.print("Element to Insert: ");
                int x = sc.nextInt();
                q.Insert(arr, x, n);
            }
            else if(a == 2){
                System.out.print("Popped Element: ");
                System.out.println(q.Deletion(arr, n));
            }
            else if (a == 3){
                q.print(arr , n);
            }
            else if(a==4){
                break;
            }
            else{
                System.out.println("Invalid Command");
            }
        }
        sc.close();
    }
}
