package HEAP;

public class DeleteHeap {
    static int delheap(int[] A , int n){
        if(n == 0){
            return -1;
        }
        int x = A[0];
        int last = A[n-1];
        n = n-1;
        int ptr = 0 ;
        int left = 1;
        int right = 2;
        while(right <= n-1){
            if(A[left]>last || A[right]>last){
                if(A[left] > A[right]){
                    A[ptr] = A[left];
                    ptr = left;
                }
                else{
                    A[ptr] = A[right];
                    ptr = right;
                }
                left = 2*ptr +1;
                right = 2*ptr+2;
            }
        }
        A[ptr] = last;
        return x;
    }
    public static void main(String[] args) {
        int A[] = {100, 80, 90, 45, 70, 60,};
        int n = A.length;
        int t = delheap(A, n);
        if( t == -1){
            System.out.println("Empty Heap");
        }
        else{
            System.out.println("Deleted Element: "+t);
        }
        for(int i = 0 ; i < n-1 ; i++){
            System.out.print(A[i]+" ");
        }
    }
}
