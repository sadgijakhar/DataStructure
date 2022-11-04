public class MergeSort1{
    public static void sort(int arr[] , int low , int high){
        if(low < high){
            int mid = (high+low)/2;
            sort(arr , low , mid);
            sort(arr, mid+1, high);
            merge(arr , low , mid , high);
        }
    }
    public static void merge(int arr[], int low , int mid , int high){
        int n1 = mid-low+1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i =0 ; i<n1 ;i++){
            left[i] = arr[i+low];
        }
        for(int i= 0 ; i < n2 ; i++){
            right[i] = arr[i+mid+1];
        }
        int i =0 ;
        int j =0 ;
        int k = low;
        while(i<n1 && j<n2){
            if(left[i] >right[j]){
                arr[k] = right[j];
                j++;
            }
            else{ 
                arr[k] = left[i];
                i++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,2,13,4,1,5,8,3};
        int low = 0;
        int high = arr.length -1;
        sort(arr, low, high);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}