
import java.util.Scanner;

public class PostfixToIn {
    static void Infix(Character arr[] , int n){
        int stack [] = new int[n];
        int j= 0;int a = 0 ; int b = 0;
        for (int i = 0 ; i < n ; i++){
            if( Character.isDigit(arr[i])){
                // System.out.println(arr[i]);
                stack[j] = Character.getNumericValue(arr[i]);
                j++;
            }
            else{
                if(stack.length < 2){
                    System.out.println("Error in equation");
                }
                else{
                    j--;
                    a = stack[j];
                    // System.out.println(a);
                    j--;
                    b = stack[j];
                    // System.out.println(b);
                    
                    if(arr[i] == '+'){
                        stack[j] = (b+a);
                        j++;
                    }
                    else if(arr[i] == '-'){
                        stack[j] = (b-a);
                        j++;
                    }
                    else if(arr[i] == '*'){
                        stack[j] = (b*a);
                        j++;
                    }
                    else if(arr[i] == '/'){
                        stack[j] = (b/a);
                        j++;
                    }
                    else if(arr[i] == '%'){
                        stack[j] = (b%a);
                        j++;
                    }
                    else if(arr[i] == '^'){
                        // double c = Math.pow(a, b);
                        stack[j] = (b^a);
                        j++;
                    }
                    // System.out.println(Arrays.toString(stack));
                }
            }
        }
        System.out.println(stack[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Character arr [] = new Character[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.next().charAt(0);
        }
        sc.close();
        Infix(arr, n);
    }
}
