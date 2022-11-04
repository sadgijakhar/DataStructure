import java.util.Scanner;

public class LinearSearch {
    static int LSearch(int arr[] , int n ,int key){
        for(int i = 0 ; i < n ;i++){
            if(arr[i] == key){
                return (i+1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element  of array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to search in array: ");
        int key = sc.nextInt();
        int x = LSearch(arr, n, key);
        if(x != -1){
            System.out.println("Position of Element "+x);
        }
        else{
            System.out.println("Element not found");
        }
        
        sc.close();
    }
}
