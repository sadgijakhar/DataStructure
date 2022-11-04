public class Test {
    static int BSearch(int arr[] , int n,int key){
        int low = 0 ;
        int  high = n-1;
        while(high >=low){
            int mid = low+ (high-low)/2;
            if(arr[mid]== key){
                return mid;
            }
            else if(arr[mid] > key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    static int LSearch(int arr[] , int n , int key){
        for(int i= 0 ; i<n ;i++){
            if(arr[i] == key){
                return i+1;
            }
        }
        return -1;
    }
    
}
