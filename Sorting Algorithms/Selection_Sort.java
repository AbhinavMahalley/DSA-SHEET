import java.util.*;

public class Selection_Sort {

    public static int[] SelectionSort(int arr[], int n){

        for(int i=0; i < n-1; i++){

            int min = i; // to find Minimun value index

            for(int j = i+1; j < n; j++){ // to travrse on loop

                if(arr[j] < arr[min]){ // condition to find index of minimum value
                    min = j;
                }
            }

            // To swap value
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int n = scn.nextInt();
        
        int arr[] = new int[n];

        System.out.println("Enter "+ n + " Array Elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }


        // To print array element
        // for(int i = 0; i < n; i++){
        //    System.out.print(arr[i]+ " ");
        // }

        // Arrays.sort(arr);   // Inbuilt java function to sort the array

        

        System.out.println("Selection Sort: "+ Arrays.toString(SelectionSort(arr,n)));

        scn.close();
    }
}
