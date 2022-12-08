package Graphs;

public class Prim {
    int[] key;
    boolean[] mst;
    int[] parent;
    Prim(int V){
        key= new int[V];
        mst= new boolean[V];
        parent= new int[V];
        for(int i=0;i<V;i++){
            parent[i]=-1;
            mst[i]=false;
            key[i]=999;
        }
    }
    public void Algo(int[][] G,int V){
        this.key[0]=0;
        int edge=0;
        int u=0;
        while(edge<V-1){
            this.mst[u]=true;
            for(int i=1; i<V;i++){
                if(G[u][i]!=0 && this.key[i]>G[u][i]){
                    this.key[i]=G[u][i];
                    this.parent[i]=u;
                }
            }
            int min=0;
            int minimum= 999;
            for(int i=1; i<V;i++){
                if(this.mst[i]==false){
                    if(this.key[i] < minimum) {
                        minimum = this.key[i];
                        min = i;
                    }
                }
            }
            u=min;
            edge++;
        }

        for(int i=1; i<V; i++){
            System.out.println(parent[i] +" <-> "+i+ " = "+key[i]);
        }
    }

    public static void main(String[] args) {
        int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
                { 0, 42, 66, 31, 0 } };
        int V=5;
        Prim graph= new Prim(V);
        graph.Algo(G, V);
    }

    public static class DFS {

        public static void main(String[] args) {

        }
    }
}
//
//Edge : Weight
//        0 - 1 :  9
//        1 - 3 :  19
//        3 - 4 :  31
//        3 - 2 :  51