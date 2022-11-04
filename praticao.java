import java.util.Scanner;

public class praticao {
    
    static int arr[];
    static int rear ;
    static int front;
    int size;
    praticao(int c){
        rear = -1;
        front = -1;
        size = c;
        arr = new int[c];
    }

    void insert(int x){
        if(front == (rear+1)%size){
            System.out.println("Overflow");
        }
        else {
            if(rear == -1){
                front = 0 ;
                rear = 0;
            }
            else{
                rear = (rear+1)%size;
            }
            arr[rear] = x;
        }
    }

    int remove(){
        int x = -1;
        if(front == -1){
            return x;
        }
        else{
            if(front == rear){
                x = arr[front];
                front = size;
            }
            else{
                x = arr[front];
                front = (front+1)%size;
            }
        }
        return x;
    }

    void display(){
        if(front == -1){
            System.out.println("Queue is Empty");
        }
        else if (front <=rear){
            for (int i = front ; i <= rear ; i++){
                System.out.print(arr[i]+ " ");
            }
        }
        else{
            for (int i = front ; i < size;i++){
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
        praticao p = new praticao(5);
        while(true){
            System.out.println();
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for dispaly");
            System.out.println("Press 4 for exit");
            System.out.println();
            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter a number to add");
                int x = sc.nextInt();
                p.insert(x);
            }
            else if(choice == 2){
                int y = p.remove();
                if(y == -1){
                    System.out.println("UnderFlow");
                }
                else{
                    System.out.println(y);
                }
                
            }
            else if(choice == 3){
                p.display();
            }
            else if(choice == 4){
                break;
            }
            else{
                System.out.println("Check your input");
            }
        }
        sc.close();
    }
}
