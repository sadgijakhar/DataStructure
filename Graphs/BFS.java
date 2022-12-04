package Graphs;

public class BFS {
    
    static int BreadthFS(int G[][], int v, int n , int VT[]){
        int[] Q = new int[v];
        int x = 0;
        Q[0] = v;
        VT[v] =1;
        int front = 0 ;
        int rear = 0;
        while(front >=0){
            for(int i = 0 ; i<n ;i++){
                if(G[Q[front]][i] ==1 && VT[i]==0){
                    rear++;
                    Q[rear] = i;
                }
            }
            x = Q[front];
            front++;
        }
        return x;
    }
    public static void main(String[] args) {
        int G[][] = new int[5][5];
        G[0][0]=0;
        G[0][1]=1;
        G[0][2]=1;
        G[0][3]=0;
        G[0][4]=0;
        G[1][0]=0;
        G[1][1]=0;
        G[1][2]=0;
        G[1][3]=0;
        G[1][4]=1;
        G[2][0]=0;
        G[2][1]=0;
        G[2][2]=1;
        G[2][3]=1;
        G[2][4]=0;
        G[3][0]=1;
        G[3][1]=1;
        G[3][2]=0;
        G[3][3]=0;
        G[3][4]=0;
        G[4][0]=0;
        G[4][1]=0;
        G[4][2]=0;
        G[4][3]=1;
        G[4][4]=0;

        
        int VT[] = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            VT[i] = 0;
        }
        
        int r = BreadthFS(G, 5, 7, VT);
        System.out.println(r);
    }
}