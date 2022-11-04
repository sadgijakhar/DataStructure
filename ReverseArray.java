import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,7,5,9};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < n/2 ;i++){
            arr[n-i-1] = arr[i] + arr[n-i-1];
            arr[i] = arr[n-i-1] - arr[i];
            arr[n-i-1] = arr[n-i-1] - arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
