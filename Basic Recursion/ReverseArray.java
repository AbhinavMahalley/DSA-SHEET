import java.util.*;

public class ReverseArray {

    public static void reverseArray(int arr[], int start, int end){

        if(start >= end){
            return;
        }

        int temp = arr[start];//0//1//2
        arr[start] = arr[end];//4//3//2
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);

    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //        1st Basic Approach with Extra Array

        int newarr[] = new int[arr.length];

        for(int i=0; i < arr.length; i++){
            newarr[i] = arr[arr.length-1-i];
        }

        System.out.println("Reverse Array with Extra Array : " + Arrays.toString(newarr));
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //     2nd Basic Approach without Extra Array
        
        int tempArr[] = arr.clone();
        
        int start = 0;
        int end = tempArr.length-1;
        
        while (start < end) {
            
            int temp = tempArr[start];
            tempArr[start] = tempArr[end];
            tempArr[end] = temp;
            
            start++;
            end--;
            
        }
        
        System.out.println("Reverse Array without Extra Array: " + Arrays.toString(tempArr)); 

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //    3rd Recursion
         start = 0;
         end = arr.length-1;
        reverseArray(arr, start, end);
        System.out.println("Reverse Array using Recursion: " + Arrays.toString(arr));

    }
}
