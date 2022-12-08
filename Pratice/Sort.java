package Pratice;

import java.util.Arrays;

public class Sort {
    
    static void bubble(int arr[] , int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 1 ; j < n-i ; j++){
                if(arr[j] < arr[j-1]){
                    int a = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[] , int n ){
        for(int i = 0 ; i < n ; i++){
            int min = arr[0];
            int index = i;
            for(int j = 0 ; j < n-1 ;j++){
                if(arr[j] < min){
                    min = arr[j];
                    index =j;
                }
            }
            int a = arr[i];
            arr[i] = min;
            arr[index] = a;
            
        }
        System.out.println(Arrays.toString(arr));

    }

    static void insertion (int arr[] ,int n){
        for(int i = 1 ; i < n ;i++){
            int key = arr[i];
            int j = i-1;
            while(j > 0){
                if(key < arr[j]){
                    int a = arr[j];
                    arr[j] = key;
                    arr[i] = a;
                }
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int arr[] = {2,8,7,5,3,28,9};
        bubble(arr , 7);
        selection(arr, 7);
        insertion(arr, 7);
    }
}
