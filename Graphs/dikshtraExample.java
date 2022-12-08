package Graphs;

import java.util.Arrays;

public class dikshtraExample{
    static int n = 8;

    void  dijkstra( int start , int graph[][]){
        int distance[] = new int[n];
        Boolean S[] = new Boolean[n];
        for(int j = 0 ; j < n ; j++){
            distance[j] = Integer.MAX_VALUE;
            S[j] = false;
        }
        distance[start] = 0;
        S[start] = true;
        int num = 1;

        while(num < n){
            int u = -1;
            for(int i = 0 ; i < n ; i++){
                if(S[i] == false && distance[i] == min(distance)){ 
                    u = i;
                }
            }
            S[u] = true;
            num++;

            for (int vx = 0; vx < n; vx++){ 
                if (S[vx] == false){ 
                    if(distance[vx] < distance[vx] + graph[u][vx]) {
                        distance[vx] = distance[vx]; 
                    }
                    else{
                        distance[vx] = distance[u] + graph[u][vx];  
                    }
                }  
            }
        }
        System.out.println(Arrays.toString(distance));
        System.out.println(Arrays.toString(S));
        printSolution(distance, n); 
    }

    // private int minimumDistance(int[] distance, Boolean[] s) {
    //     int m_index = 0; 
    //     for(int i = 0 ; i < n ; i++){
    //         if(s[i] == false && distance[i] == min(distance)){ 
    //             m_index = i;
    //         }
    //     }
    //     System.out.println(m_index + "midhvh");
    //     return m_index;
    // }
    private int min(int[] distance) {
        int min = 0;
        for(int i = 0  ; i < n ; i++){
            if(min > distance[i] && distance[i] > -1){
                min = distance[i];
            }
        }
        System.out.println(min);
        return min;
    }

    void printSolution(int distance[], int n){  
        System.out.println("The shortest Distance from source 0th node to all other nodes are: ");  
        for (int j = 0; j < n; j++){ 
            System.out.println("To " + j + " the shortest distance is: " + distance[j]);  
        }
    }
    public static void main(String[] args) {
        int graph[][] = {{0,-1,-1,-1,-1,-1,-1,-1},{300,0,-1,-1,-1,-1,-1,-1},{1000,800,0,-1,-1,-1,-1,-1},{-1,-1,1200,0,-1,-1,-1,-1},{-1,-1,-1,1500,0,350,-1,-1},{-1,-1,-1,1000,-1,0,900,-1},{-1,-1,-1,-1,-1,-1,0,1000},{1700,-1,-1,-1,-1,-1,-1,0}};
        dikshtraExample o = new dikshtraExample();
        o.dijkstra(0, graph);


    }
}