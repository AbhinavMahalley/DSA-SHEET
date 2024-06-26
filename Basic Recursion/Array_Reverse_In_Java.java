import java.util.*;

public class Array_Reverse_In_Java {

    public static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }


    
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4};

        
        int rarr[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            rarr[i] = arr[arr.length - 1 - i]; 
        }


        System.out.println( "With Extra array :  "+ Arrays.toString(rarr));
        
        int tempArr[] = arr.clone(); 
        
        int start  = 0;
        int end = tempArr.length-1;
        
        while (start < end){
            int temp = tempArr[start];
            tempArr[start] = tempArr[end];
            tempArr[end] = temp;
            end--;
            start++;
        }
        System.out.println( "With Loop :  "+ Arrays.toString(rarr));

        reverseArray(arr, start, end);
        System.out.println("Reversed array using recursion is " + Arrays.toString(arr));

    }
}
