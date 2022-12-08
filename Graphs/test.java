package Graphs;

import java.util.*; 
import java.lang.*; 
import java.io.*; 
   
public class test { 
     
    static final int num_Vertices = 6;  //max number of vertices in graph
    // find a vertex with minimum distance
    int minDistance(int path_array[], Boolean sptSet[])   { 
        // Initialize min value 
        int min = Integer.MAX_VALUE, min_index = -1; 
        for (int v = 0; v < num_Vertices; v++) 
            if (sptSet[v] == false && path_array[v] <= min) { 
                min = path_array[v]; 
                min_index = v; 
            } 
   
        return min_index; 
    } 
   
    // print the array of distances (path_array)
    void printMinpath(int path_array[])   { 
        System.out.println("Vertex# \t Minimum Distance from Source"); 
        for (int i = 0; i < num_Vertices; i++) 
            System.out.println(i + " \t\t\t " + path_array[i]); 
    }
    
// Implementation of Dijkstra's algorithm for graph (adjacency matrix) 
    void algo_dijkstra(int graph[][], int src_node)  { 
        int path_array[] = new int[num_Vertices]; // The output array. dist[i] will hold 
        // the shortest distance from src to i 
   
        // spt (shortest path set) contains vertices that have shortest path 
        Boolean sptSet[] = new Boolean[num_Vertices]; 
   
        // Initially all the distances are INFINITE and stpSet[] is set to false 
        for (int i = 0; i < num_Vertices; i++) { 
            path_array[i] = Integer.MAX_VALUE; 
            sptSet[i] = false; 
        } 
   
        // Path between vertex and itself is always 0 
        path_array[src_node] = 0; 
   // now find shortest path for all vertices  
        for (int count = 0; count < num_Vertices - 1; count++) { 
            // call minDistance method to find the vertex with min distance
            int u = minDistance(path_array, sptSet); 
              // the current vertex u is processed
            sptSet[u] = true; 
              // process adjacent nodes of the current vertex
            for (int v = 0; v < num_Vertices; v++) 
   
                // if vertex v not in sptset then update it  
                if (!sptSet[v] && graph[u][v] != 0 && path_array[u] != 
                            Integer.MAX_VALUE && path_array[u] 
                            + graph[u][v] < path_array[v]) 
                            path_array[v] = path_array[u] + graph[u][v]; 
        } 
   
        // print the path array 
        printMinpath(path_array); 
    } 
}
class Main{
    public static void main(String[] args) 
    { 
        //example graph is given below
        int graph[][] = new int[][] {{0,0,0,0,0,0,0,0},{300,0,0,0,0,0,0,0},{1000,800,0,0,0,0,0,0},{0,0,1200,0,-1,-1,-1,-1},{-1,-1,-1,1500,0,350,-1,-1},{-1,-1,-1,1000,-1,0,900,-1},{-1,-1,-1,-1,-1,-1,0,1000},{1700,-1,-1,-1,-1,-1,-1,0}}; 
        test g = new test(); 
        g.algo_dijkstra(graph, 0); 
    } 
}