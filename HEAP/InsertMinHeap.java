package HEAP;
import java.util.Arrays;
public class InsertMinHeap {
    static void minheap(int []A , int n, int x){
        n = n+1;
        int par = n-1;
        while(par>1){
            double value = (par-1)/2;
            int parent = (int)Math.ceil(value);
            if(A[parent] < x ){
                A[par] = x;
                return;
            }
            else{
                A[par] = A[parent];
                par = parent;
            }
        }
        A[0] = x;
        return;
    }
    public static void main(String[] args) {
        int A [] = new int[10];
        // INSHEAP(A, -1, 50);
        minheap(A, 0, 60);
        minheap(A, 1, 45);
        minheap(A, 2, 70);
        minheap(A, 3, 80);
        minheap(A, 4, 90);
        minheap(A, 5, 100);
        System.out.println(Arrays.toString(A));
    }
}
