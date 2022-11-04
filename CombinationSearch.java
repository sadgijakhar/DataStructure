import java.util.Scanner;

public class CombinationSearch {
    static int Search(int arr[], int n, int key){
        for(int i = n/2 ; i < n ; i++){
            if(arr[i] == key){
                return i+1;
            }
        }
        int low = 0;
        int high = n/2-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == key){
                return mid+1;
            }
            else if(arr[mid] > key){
                high = mid -1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = {5,10,35,42,60,78,8,-19,25,1};
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        if(n%2==0){
            int arr[] = new int[n];
            System.out.println("Enter elements of array as per requirment: ");
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Enter element to search: ");
            int key = sc.nextInt();
            int x = Search(arr, n, key);
            if(x != -1){
                System.out.println("Position of Element "+x);
            }
            else{
                System.out.println("Element not found");
            }
        }
        else{
            System.out.println("Array Length Should be even ");
        }
        
        sc.close();
        
    }
}
