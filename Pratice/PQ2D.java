package Pratice;

import java.util.Scanner;
public class PQ2D {
    
    static void insert(int Q[][], int front[] ,int rear[] , int x ,int cols, int pr){
        if(front[pr] == (rear[pr]+1)%cols){
            System.out.println("Overflow");
        }
        else{
            if(front[pr] == -1){
                front[pr] = 0;
                rear[pr] = 0;
            }
            else{
                rear[pr] = (rear[pr]+1)%cols;
            }
            Q[pr][rear[pr]] = x;
        }
    }
    static int pop(int Q[][], int front[] , int rear[], int rows , int cols){
        int y = 0 ;
        int a = -1;
        while(y <= rows-1){
            if(front[y] != -1){
                a = Q[y][front[y]];
                if(front[y] == rear[y]){
                    front[y] = -1;
                    rear[y] =-1;
                }
                else{
                    front[y] = (front[y]+1)%cols;
                }
                break;
            }
            
        }
        return a;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int Q[][] = new int[rows][cols];
        int front[] = new int[cols];
        int rear[] = new int[cols];
        for(int i = 0 ; i < cols ; i++){
            rear[i] =-1;
            front[i] = -1;
        }
        for(int i= 0; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                Q[i][j] = -1;
            }
        }
        while(true){
            System.out.println("Press 1 for Insert");
            System.out.println("Press 2 for Delete");
            System.out.println("Press 3 for print");
            System.out.println("Press 4 for exit");
            int a = sc.nextInt();
            if(a == 1){
                System.out.print("Element to Insert: ");
                int x = sc.nextInt();
                System.out.print("Priorty Of element: ");
                int pr = sc.nextInt();
                insert(Q, front, rear, x, cols, pr);
            }
            else if(a == 2){
                System.out.print("Popped Element: ");
                System.out.println(pop(Q, front, rear, rows, cols));
            }
            else if (a == 3){
                print(Q , front,rear,cols,rows);
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
