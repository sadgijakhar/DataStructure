import java.util.Scanner;

public class implementTwoStackInOneArray {
    static int[] arr;
    static int top1;
    static int top2;
    static int n;

    implementTwoStackInOneArray(int size){
        int n = size;
        top1 = -1;
        top2 = n;
        arr = new int[size];
    }
     
    void push1(int x){
        if(top1 == top2){
            System.out.println("Overflow");
        }
        else{
            if(top1 == -1){
                top1= 0;
            }
            else{
                top1++;
            }
            arr[top1] = x;
        }
    }
    static void push2(int x){
        if(top1 == top2){
            System.out.println("Overflow");
        }
        else{
            if(top2 == n){
                top1= n-1;
            }
            else{
                top2--;
            }
            arr[top2] = x;
        }
    }
    static int pop1(){
        int x = -1;
        if(top1 == -1){
            return x;
        }
        else{
            if(top1 == 0){
                x = arr[top1];
                top1 = -1;
            }
            else{
                x = arr[top1];
                top1--;
            }
            return x;
        }
    }
    static int pop2(){
        int x = -1;
        if(top2 == n){
            return x;
        }
        else{
            if(top2 == n-1){
                x = arr[top2];
                top2 = n;
            }
            else{
                x = arr[top2];
                top2++;
            }
            return x;
        }
    }

    static void display1(){
        for(int i =0 ; i<= top1 ;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void display2(){
        for(int i = top2 ; i <n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        implementTwoStackInOneArray p = new implementTwoStackInOneArray(10);
        while(true){
            System.out.println();
            System.out.println("Press 1 for push1");
            System.out.println("Press 2 for pop1");
            System.out.println("Press 3 for dispaly1");
            System.out.println("Press 4 for push2");
            System.out.println("Press 5 for pop2");
            System.out.println("Press 6 for dispaly2");
            System.out.println("Press 7 for exit");
            System.out.println();
            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter a number to add");
                int x = sc.nextInt();
                p.push1(x);
            }
            else if(choice == 2){
                int y = pop1();
                if(y == -1){
                    System.out.println("UnderFlow");
                }
                else{
                    System.out.println(y);
                }
                
            }
            else if(choice == 3){
                display1();
            }
            else if(choice == 4){
                System.out.println("Enter a number to add");
                int x = sc.nextInt();
                push2(x);
            }
            else if(choice == 5){
                int y = pop2();
                if(y == -1){
                    System.out.println("UnderFlow");
                }
                else{
                    System.out.println(y);
                }
                
            }
            else if(choice == 6){
                display2();
            }
            else if(choice == 7){
                break;
            }
            else{
                System.out.println("Check your input");
            }
        }
        sc.close();
    }

}
