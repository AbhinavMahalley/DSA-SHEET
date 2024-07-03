import java.util.*;

public class Fibonacci_Number {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =  scn.nextInt(); //3 
        
        /////////////////////////////////////////////////////////////////////////////////////////////////
        //   1st  Basic Approach
        

        if(n == 0 || n == 1){
            System.out.println(n);
        }

        int fib0 = 0; // f[1] = 1 // f[2] = 1
        int fib1 = 1; // f[2] = 1 // f[3] = 2
    

        for(int i = 2; i <= n; i++){ // f[2] = f[1] + f[0]  -> f[3] = f[2] + f[1]

            int  temp = fib1 + fib0;  // 1+0 = 1 ->  1+1 = 2
            fib0 = fib1; 
            fib1 = temp;

        }

        System.out.println(fib1);

        scn.close();
        
    }
}
