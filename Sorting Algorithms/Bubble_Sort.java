import java.util.*;

public class Bubble_Sort {

    public static int[] BubbleSort(int arr[], int n){

        for(int i = 0; i < n; i++){ // steps or passes

            for(int j = 0; j < n-1 ; j++){ // To travers on array

                if(arr[j] > arr[j+1]){ // to compare between adjecent element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }


        return arr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scn.nextInt(); //length

        int arr[] = new int[n];

        System.out.println("Enter "+ n + " Array Elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        int newarr[] = BubbleSort(arr,n);

        System.out.print("Sorted Array: " );

        for(int i = 0; i < n; i++ ){
            System.out.print(newarr[i]+" ");
        }


        scn.close();

    }
    
}
