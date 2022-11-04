import java.util.Scanner;

public class PriorityQueue{
    public static void Insert(int Q[][] , int front[] , int rear [], int x, int col, int pr){
        if (front[pr] == (rear[pr]+1)%col){
            System.out.println("Overflow");
        }
        else{
            if(front[pr] == -1){
                front[pr] = 0;
                rear[pr] = 0;
            }
            else{
                rear[pr] = (rear[pr]+1)%col;
            }
            Q[pr][rear[pr]] =x;
        }
        
    }
    public static void print(int Q[][],int front[], int rear[],int n ,int m){
        System.out.println();
        for(int i = 0 ; i < n; i++){
            if (front[i] !=-1){
                for(int j = front[i] ; j < m; j++){
                    if(Q[i][j] != -1){
                        System.out.print(Q[i][j] +" ");
                    }
                    
                }
                System.out.println();
            }
            
        }

    }

    public static int Pop(int Q[][] , int front [], int rear[] , int col,int n){
        int y = 0;
        int a = 0;
        while(y <= n-1){
            if(front[y] != -1){
                a = Q[y][front[y]];
                if(front[y] == rear[y]){
                    front[y] = -1;
                    rear[y] = -1;
                }
                else{
                    front[y] = (front[y] + 1)%col;
                }
                break;
            }
            y++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int col = 4;
        int Q[][] = new int[n][col];
        int front[] = new int[col];
        int rear[] = new int[col];
        for(int i = 0 ; i < col ;i++){
            front[i] = -1;
            rear[i] = -1;
        }
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j<col ;j++){
                Q[i][j] = -1;
            }
        }
        
        while(0<1){
            System.out.println("Press 1 for Insert");
            System.out.println("Press 2 for Delete");
            System.out.println("Press 3 for print");
            System.out.println("Press 4 for exit");
            int a = sc.nextInt();
            if(a == 1){
                System.out.print("Element to Insert: ");
                int x = sc.nextInt();
                System.out.print("Periorty Of element: ");
                int pr = sc.nextInt();
                Insert(Q, front, rear, x, col, pr);
            }
            else if(a == 2){
                System.out.print("Popped Element: ");
                System.out.println(Pop(Q, front, rear, col, n));
            }
            else if (a == 3){
                print(Q , front,rear,col,n);
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