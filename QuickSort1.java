public class QuickSort1 {
    public static void sort(int arr[], int low , int high){
        if(low<high){
            int pivot = Partition(arr, low, high);
            sort(arr, low, pivot-1);
            sort(arr, pivot+1, high);
        }
    }
    public static int Partition(int arr[],int low ,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low ; j<high-1;j++){
            if(arr[j] < pivot){
                i++;    
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[i+1] = arr[high] + arr[i+1];
        arr[high] = arr[i+1] - arr[high];
        arr[i+1] = arr[i+1] - arr[high];
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,9,8,7,6,4};
        int low =0;
        int high = arr.length -1;
        sort(arr, low, high);
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
