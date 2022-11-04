import java.util.Scanner;
public class IandJSum {
    static void sum(int arr[][] , int n){
        for(int k = 0 ; k < n ; k++){
            for(int j =0 ; j < n ;j++){
                if((k+j) > arr[k][j]){
                    System.out.println("Element "+arr[k][j]+" where i + j : "+(k+j));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of row in square matrix: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j =0 ; j < n ;j++){
                arr[i][j] = sc.nextInt();
            } 
        }
        sum(arr, n);
        sc.close();
    }
}
