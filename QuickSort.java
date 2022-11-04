import java.util.Arrays;

public class QuickSort {
    public static void Quick(int arr[], int low ,int high){
        if(high >= low){
            int pivot = arr[low];
            int right = high;
            int left = low+1;
            while(right > left){
                while(arr[right] > pivot  && right >low+1){
                    right--;
                }
                while(arr[left] < pivot && left < high){
                    left++;
                }
                if(left != right){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                // System.out.println(right);
                // System.out.println(left);
            }
            if(right == left || right<left){
                
                int temp =arr[right];
                arr[right]  = pivot;
                arr[low] = temp;
                
            }
            // System.out.println(right);
            // System.out.println(Arrays.toString(arr));
            Quick(arr, low, right-1);
            Quick(arr, right+1, high);
        }
        
        
    }
    public static void main(String[] args) {
        int arr[] = {4,5,7,13,1,2,3};
        int low = 0;
        int high = arr.length -1;
        Quick(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}
