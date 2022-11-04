import java.util.Scanner;

public class ImplementCircularQueue {
    int front1 ;
    int rear1;
    int n1 ;
    int front2 ;
    int rear2;
    int n2 ;
    ImplementCircularQueue(int n){
        this.front1 = -1;
        this.rear1 = -1;
        this.n1 = n/2;
        this.front2 = n1;
        this.rear2 = n1;
        this.n2 = n;
    }
    Scanner sc = new Scanner(System.in);
    void insert1(int arr[]){
        if(front1 == (rear1+1)%n1){
            System.out.println("overflow");
        }
        else{
            if(rear1 == -1){
                front1 = 0;
                rear1 = 0;
            }
            else{
                rear1 = (rear1+1)%n1;
            }
            System.out.print("Element to Insert: ");
            int x = sc.nextInt();
            arr[rear1] = x;
        }
        
    }
    void insert2(int arr[]){
        if(front2 == (rear2+1)%n2){
            System.out.println("overflow");
        }
        else{
            if(rear2 == n1){
                front2 = n1+1;
                rear2 = n1+1;
            }
            else{
                rear2 = (rear2+1)%n2;
                if(rear2 == 1){
                    rear2 = rear2+n1;
                }
            }
            System.out.print("Element to Insert: ");
            int x = sc.nextInt();
            arr[rear2] = x;
        }
        
    }
    int Deletion1(int arr[]){
        int a = 0;
        if(front1 == -1){
            System.out.println("Underflow");
        }
        else if(rear1 == front1){
            a = arr[front1];
            front1 = -1 ;
            rear1 = -1;
        }
        else{
            a = arr[front1];
            front1 = (front1+1)%n1;
        }
        return a; 
    }
    int Deletion2(int arr[]){
        int a = 0;
        if(front2 == n1){
            System.out.println("Underflow");
        }
        if(rear2 == front2){
            a = arr[front2];
            front2 = n1 ;
            rear2 = n1;
        }
        else{
            a = arr[front2];
            front2 = (front2+1)%n2;
            if(front2 == 0 ){
                front2 = front2 + n1 ;
            }
        }
        return a;
         
    }
    void print1(int arr[]){
        if(front1 == -1){
            System.out.println("Queue is Empty");
        }
        else if (front1 <= rear1){
            for (int i = front1 ; i <= rear1 ; i++){
                System.out.print(arr[i]+ " ");
            }
        }
        else{
            for (int i = front1 ; i < n1;i++){
                System.out.print(arr[i]+" ");
            }
            for(int j = 0 ; j <= rear1 ; j++){
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
        
    }
    void print2(int arr[]){
        if(front2 == n1){
            System.out.println("Queue is Empty");
        }
        else if (front2 <=rear2){
            for (int i = front2 ; i <= rear2; i++){
                System.out.print(arr[i]+ " ");
            }
        }
        else{
            for (int i = front2 ; i < n2;i++){
                System.out.print(arr[i]+" ");
            }
            for(int j = 0 ; j <= rear2 ; j++){
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        ImplementCircularQueue q = new ImplementCircularQueue(6);
        // System.out.println("Size of Array: ");
        // int n = q.sc.nextInt();
        int n=6;
        int arr[] = new int[n];
        while(n > 0){
            System.out.println();
            System.out.println("Press 1 for Insert in Queue 1");
            System.out.println("Press 2 for Delete in Queue 1");
            System.out.println("Press 3 for print in Queue 1");
            System.out.println("Press 4 for Insert in Queue 2");
            System.out.println("Press 5 for Delete in Queue 2");
            System.out.println("Press 6 for print in Queue 2");
            System.out.println("Press 7 for exit ");
            System.out.println();
            System.out.print("Enter Your Choice: ");
            int a = q.sc.nextInt();
            if(a == 1){
                q.insert1(arr);
            }
            else if(a == 2){  
                int x =q.Deletion1(arr)  ;
                if(x == 0){
                    System.out.println();
                }
                else{
                    System.out.println("Popped Element: "+x);
                }
            }
            else if (a == 3){
                q.print1(arr);
            }
            else if(a == 4){
                // System.out.print("Element to Insert: ");
                q.insert2(arr);
            }
            else if(a == 5){
                int x =q.Deletion2(arr)  ;
                if(x== 0){
                    System.out.println();
                }
                else{
                    System.out.println("Popped Element: "+x );
                }
                
                
            }
            else if (a == 6){
                q.print2(arr);
            }
            else if(a==7){
                break;
            }
            else{
                System.out.println("Invalid Command");
            }
        }
        q.sc.close();
    }
}
