import java.util.Scanner;
public class SparseMatrix{
    static void Sparse(int arr[][] ,int rows, int columns){
        int size = 0;
        for (int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < columns ; j++){
                if(arr[i][j] != 0){
                    size++;
                }
            }
        }
        int k = 0;
        int arr1[][] = new int[3][size];
        for(int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < columns; j++){
                if(arr[i][j] != 0){
                    arr1[0][k] = i;
                    arr1[1][k] = j;
                    arr1[2][k] = arr[i][j];
                    k++;
                }
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < size; j++){
                System.out.printf("%d ", arr1[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns ");
        int columns = sc.nextInt();
        int arr [][] = new int[rows][columns];
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j<columns ;j++){
                System.out.print("Enter the "+i+" "+j + " position Element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        Sparse(arr, rows, columns);
        sc.close();
    }
}