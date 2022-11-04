import java.util.Scanner;
public class UpperAndLowerTriangle {
    public static void UpperTriangle(int arr[][] , int n){
        System.out.println("Upper Triangular Marix : ");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ;j++){
                if (i > j){
                    System.out.print("0" + " ");
                }
                else
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void LowerTriangle(int arr[][] , int n){
        System.out.println("Lower Triangular Marix : ");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ;j++){
                if (i < j){
                    System.out.print("0" + " ");
                }
                else
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Diagonal(int arr[][] , int n){
        System.out.println("Diagonal Marix : ");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ;j++){
                if ((i < j) || (i > j)){
                    System.out.print("0" + " ");
                }
                else
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of row of square matrix: ");
        int n = sc.nextInt();
        int arr[][]= new int[n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j =0 ;j < n ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        UpperTriangle(arr, n);
        
        LowerTriangle(arr, n);
        Diagonal(arr, n);
        sc.close();
    }
}
