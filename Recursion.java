public class Recursion {
    // Factorial

    static int fact(int n){
        if(n <=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    // Fabonic Series
    static int fabonic(int n ){
        if(n ==1){
            return 1;
        }
        else if(n<=0){
            return 0;
        }
        else{
            return fabonic(n-2)+fabonic(n-1);
        }
        
    }

    // GCD or HCF

    static int hcf(int n , int m){
        if(n%m==0){
            return m;
        }
        else{
            return hcf(m,n%m);
        }
    }

    // Tower of hanoi 
    static void hanoi(int A , int B, int C , int n){
        if(n ==1){
            System.out.println(A+" to "+B);
        }
        else{
            hanoi(A, C, B, n-1);
            System.out.println(A +" to "+ B);
            hanoi(C, B, A, n-1);
        }
    }
    public static void main(String[] args) {
        // System.out.println(fact(5));
        // System.out.println(fabonic(7));
        // System.out.println(hcf(45,12));
        hanoi(1, 2, 3, 3);
    }
}
