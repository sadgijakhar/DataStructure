import java.util.Arrays;
public class Sorting {
    public static void Bubble(int arr[] , int n){
        for(int i = 0 ; i <= n-1 ; i++){
            for(int j = 0 ; j < n-1-i ;j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j+1] + arr[j];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
            // System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void Selection(int arr[] ,int n){
        int min = 0;
        int index = 0;
        for(int i = 0 ; i < n-1; i++){
            min = arr[i];
            index = i;
            for(int j = 1+i ; j < n ;j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
                
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
            // System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void Insertion(int arr[] , int n){
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[i] = arr[j];
                arr[j] = key;
                j--;
                i--;
            }
            // System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,6,8,7,1,10};
        int n = arr.length;
        Bubble(arr,n);
        Selection(arr, n);
        Insertion(arr, n);
    }
}

