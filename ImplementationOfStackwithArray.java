import java.util.Scanner;
public class ImplementationOfStackwithArray{
    static int arr[];
    static int end ;
    static int size;
    ImplementationOfStackwithArray(int c){
        size = c;
        arr = new int[c];
        end = -1;
    }
    int insert(int x){
        if(end == size-1){
            System.out.println("Overflow");
            return 0;
        }
        if(end == -1){
            end = 0;
        }
        else{
            end++;
        }
        arr[end] = x;
        return 1;
    }
    int pop(){
        if(end == -1){
            return -1;
        }
        int x = 0;
        if(end == 0){
            x = arr[end];
            end = -1;
        }
        else{
            x= arr[end];
            end--;
        }
        return x;
    }
    void display(){
        for(int i = end ; i > -1 ;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementationOfStackwithArray p = new ImplementationOfStackwithArray(5);
        while(true){
            System.out.println();
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for dispaly");
            System.out.println("Press 4 for exit");
            System.out.println();
            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter a number to add");
                int x = sc.nextInt();
                p.insert(x);
            }
            else if(choice == 2){
                int y = p.pop();
                if(y == -1){
                    System.out.println("UnderFlow");
                }
                else{
                    System.out.println(y);
                }
                
            }
            else if(choice == 3){
                p.display();
            }
            else if(choice == 4){
                break;
            }
            else{
                System.out.println("Check your input");
            }
        }
        sc.close();
    }
}