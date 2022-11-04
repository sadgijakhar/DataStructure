import java.io.*;
public class EquilibriumPoint {
    
    public static int equilibriumPoint(long arr[], int n) {
        long sum = 0;
        for(int i =0  ; i< n ; i++){
            sum += arr[i];
        }
        long sum1 = 0;
        for(int i =0 ; i<n ;i ++){
            sum = sum -arr[i];
            if(sum == sum1){
                return i+1;
            }
            sum1 = sum1+arr[i];
        }
        return -1;
        // Your code here
    }


    public static void main(String[] args) throws IOException {
        long arr[] = {1,3,5,2,2};
        int n = 5;
        System.out.println(equilibriumPoint(arr, n));
        
    }
}
