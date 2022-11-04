import java.util.Scanner;

public class Matrix2D{
   public static void Addition(int arr1[][] , int n , int arr2[][] ){
    int arr[][] = new int[n][n];
    for(int i = 0 ; i < n ;i++){
        for(int j = 0 ; j < n ; j++){
            arr[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    System.out.println("Addition: ");
    print(arr,n);
   }
   public static void Substraction(int arr1[][] , int n , int arr2[][] ){
    int arr[][] = new int[n][n];
    for(int i = 0 ; i < n ;i++){
        for(int j = 0 ; j < n ; j++){
            arr[i][j] = arr1[i][j] - arr2[i][j];
        }
    }
    System.out.println("Substration: ");
    print(arr,n);
   }
   public static void Multiplication(int arr1[][] , int n , int arr2[][] ){
    int arr[][] = new int[n][n];
    for(int i = 0 ; i < n ;i++){
        for(int j = 0 ; j < n ; j++){
            arr[i][j] = 0 ;
            for (int k = 0 ; k < 3 ; k++){
                arr[i][j] +=  arr1[i][k] * arr2[k][j];
            }
        }
        
    }
    System.out.println("Multiplication: ");
    print(arr,n);
   }
   public static void Transpose(int arr1[][] , int n  ){
    int arr[][] = new int[n][n];
    for(int i = 0 ; i < n ;i++){
        for(int j = 0 ; j < n ; j++){
            arr[j][i] = arr1[i][j] ;
        }
    }
    System.out.println("Transpose: ");
    print(arr, n);
   }

   public static void print(int arr[][] ,int n){
    for(int i = 0 ; i < n ;i++){
        for(int j =0 ; j < n ; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
   }
   
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of row in square matrix: ");
    int n = sc.nextInt();
    int arr1[][] = new int[n][n];
    int arr2[][] = new int[n][n];
    System.out.println("Element of first array row wise: ");
    for(int i = 0 ; i < n ; i++){
        for(int j =0 ; j < n ;j++){
            arr1[i][j] = sc.nextInt();
        }
    }
    System.out.println("Element of second array row wise: ");
    for(int i = 0 ; i < n ; i++){
        for(int j =0 ; j < n ;j++){
            arr2[i][j] = sc.nextInt();
        }
    }
    Addition(arr1, n, arr2);
    Substraction(arr1, n, arr2);
    Multiplication(arr1, n, arr2);
    Transpose(arr1, n);
    Transpose(arr2, n);
    sc.close();
   }
}