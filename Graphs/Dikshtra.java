package Graphs;

import java.util.Arrays;

public class Dikshtra{
    static class Graph{
        int v;
        int e;
        int[][] costM;

        Graph(int v, int e){
            this.v = v;
            this.e = e;

            costM = new int[v][v];
            for(int i = 0 ; i < v; i++){
                Arrays.fill(costM[i], 0);
            }
        }

        void addedge(int start , int e ,int value){
            costM[start][e] = value;
        }

        void dikstra(int start){
            int S[] = new int[v];
            int dist[] = new int[v];

            int n = v; 
            for(int i =0 ;i <n-1 ; i++){
                S[i] = 0;
                dist[i] = costM[start][i];
            }
            S[start] = 1;
            dist[start] = 0;
            int num =1;
            while(num < v){
                int min  =  costM[start][0];
                int u =0;
                for (int t =0 ; t < v ; t++){
                    if(min > costM[start][t]){
                        min = costM[start][t];
                        u = t; 
                    }
                }
                if(S[u] == 0){
                    dist[u] = min;
                    S[u] = 1;
                    num++;
                }
                for(int w = 0  ; w < v ;w++){
                    
                    if(S[w]==0){
                        int c = dist[w]+costM[u][w];
                        if(dist[w] > c){
                            c = dist[w];
                        }
                        dist[w] = c;
                    }
                }
            }

            System.out.println(Arrays.toString(dist));
            System.out.println(Arrays.toString(S));
        }
        
    }
    public static void main(String[] args) {
        // Dikshtra d = new Dikshtra();
        Graph G = new Graph(8, 10);
        G.addedge(0,0,0);
        G.addedge(1,0,300);
        G.addedge(1,1,0);
        G.addedge(2,0,1000);
        G.addedge(2,1,800);
        G.addedge(2,2,0);
        G.addedge(3,2,1200);
        G.addedge(3,3,0);
        G.addedge(4,3,1500);
        G.addedge(4,4,0);
        G.addedge(4,5,350);
        G.addedge(5,3,1000);
        G.addedge(5,5,0);
        G.addedge(5,6,900);
        G.addedge(6,6,0);
        G.addedge(6,7,1000);
        G.addedge(7,0,1700);
        G.addedge(7,7,0);
        G.dikstra(0);

    }
    
    
}