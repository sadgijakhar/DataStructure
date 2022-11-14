package HEAP;

import java.util.Arrays;

public class InsertMaxHeap {
    static void INSHEAP(int A[], int n , int x){
        n = n+1;
        int ptr = n-1;
        while(ptr>0){
            double value = (ptr-1)/2;
            int parent = (int)Math.ceil(value);
            System.out.println(parent);
            if(x <= A[parent]){
                A[ptr] = x;
                System.out.println(Arrays.toString(A));
                return;
            }
            else{
                A[ptr] = A[parent];
                ptr = parent;
            }
        }
        A[0] = x;
        System.out.println(Arrays.toString(A));
        return;
    }
    public static void main(String[] args) {
        int A [] = new int[10];
        // INSHEAP(A, -1, 50);
        INSHEAP(A, 0, 60);
        INSHEAP(A, 1, 45);
        INSHEAP(A, 2, 70);
        INSHEAP(A, 3, 80);
        INSHEAP(A, 4, 90);
        INSHEAP(A, 5, 100);
        System.out.println(Arrays.toString(A));
    }
}
