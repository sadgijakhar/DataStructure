package Graphs;

import java.util.*;
 

public class DFS {
    int v;   
    int[][] adj;
    // Stack<Integer> st = new Stack<>();
    DFS(int v){
        this.v = v;
            
        adj = new int[v][v];
        for(int row = 0; row < v; row++){
            Arrays.fill(adj[row], 0);
        }
        // System.out.println(Arrays.deepToString(adj));
        
    }
    void addEdge(int start, int e){
        // Considering a bidirectional edge
        adj[start][e] = 1;
        adj[e][start] = 1;
        // System.out.println(Arrays.deepToString(adj));

    }
    
    void DFSUtil(int vertex, boolean nodes[])
    {
        nodes[vertex] = true; 
        System.out.print(vertex + " ");
        // System.out.println(Arrays.toString(nodes));
        
        for (int i = 0; i < v; i++){
            if(adj[vertex][i] == 1 && !nodes[i]){
                // System.out.println(i);
                DFSUtil(i, nodes);
            }
        }  
    }

    void DFS1(int v1){
        boolean already[] = new boolean[v];  
        for(int i = 0 ; i < v ;i++){
            already[i] = false; 
        }
        // System.out.println(Arrays.toString(already));
        DFSUtil(v1, already);
    }
 
    public static void main(String args[])
    {
        DFS g = new DFS(6);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
 
        System.out.println(
            "Following is Depth First Traversal: ");
 
        g.DFS1(0);
    }
}
