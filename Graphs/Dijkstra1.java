package Graphs;

public class Dijkstra1 {
    int[] distance;
    boolean[] visited;
    Dijkstra1(int V){
        this.distance=new int[V];
        this.visited=new boolean[V];

        for(int i=0;i<V;i++){
            this.distance[i]=Integer.MAX_VALUE;
            this.visited[i]=false;
        }
    }
    public void algo(int[][] Graph, int source, int V){
        distance[source]=0;
        for(int i=0; i< Graph.length;i++){
            int minvalue= Integer.MAX_VALUE;
            int min=-1;
            for(int j=0; j< distance.length; j++){
                if(distance[j]<minvalue && visited[j]==false){
                    minvalue=distance[j];
                    min=j;
                }
            }
            int u=min;
            visited[u]=true;

            for(int j=0; j< Graph[u].length;j++){
                if(visited[j]==false && Graph[u][j]!=0 && (distance[j]>distance[u]+ Graph[u][j])){
                    distance[j]=distance[u]+ Graph[u][j];
                }
            }
        }
        for(int i=0;i<distance.length;i++){
            System.out.println(i+"->"+distance[i]);
        }
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 0, 1, 2, 0, 0, 0 }, { 0, 0, 2, 0, 0, 3, 0 }, { 1, 2, 0, 1, 3, 0, 0 },
                { 2, 0, 1, 0, 0, 0, 1 }, { 0, 0, 3, 0, 0, 2, 0 }, { 0, 3, 0, 0, 2, 0, 1 }, { 0, 0, 0, 1, 0, 1, 0 } };
        Dijkstra1 T = new Dijkstra1(7);
        T.algo(graph, 0,7);
    }
}

