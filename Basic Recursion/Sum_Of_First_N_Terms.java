// Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

// Example 1:
// Input:
// n=5
// Output:
// 225
// Explanation:
// 1^3 + 2^3 + 3^3 + 4^3 + 5^3 = 225


// How to approach quest 1st read question identify what we need to do in program and what is expected input & output

// 1st - (INPUT) we get One Integer as Input 
// 2nd - (LOGIC) we need to Sum of Cube of all integer from 1 to N
// 3rd - (OUTPUT)Print Sum

import java.util.*;

public class Sum_Of_First_N_Terms {

                        //initial value & last value/Entered Number N
    public static int Sum1(int i, int n){
        // base condition  
        // same as base logic for loop  we need to do recursion until value of i is equal to n
        if(i==n){
            return  (int)Math.pow(i, 3);
        }
        
        // return i*i*i + Sum(i+1, n)
        return (int)Math.pow(i, 3) + Sum1(i+1, n);
    }
    
                        // Entered Number N
    public static int Sum2(int n){

        // Base condition
        // At last when value of n is 1  we need to return cube of 1 = 1*1*1 = 1
        // why n==1 not other condition we start cube from 1 to N   we dont need cube of 0 or below integer
        if(n==1){
            return  1;
        }
        
        // return n*n*n + Sum2(n-1)
        return (int)Math.pow(n, 3) + Sum2(n-1);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number: ");
        int N = scn.nextInt();

        //         1st Approach
        // Basic Approach  we use for loop from 1 to N
        // To save we required one variable to store Sum

        int Sum = 0;

        // [initial value i=1] , [Base condition i should be less than or equal to N],[increment value]
        for(int i = 1; i <= N; i++){

            // Sum = Sum + i*i*i;
            //         OR
            // Sum += i*i*i;
            //         OR 
            // we use Math.pow() inbuilt function of java.util package for cube Ex. Math.pow( n <- Number, p <- power) = Math.pow(2,3)=8
            // We need to typecast the Math.pow() because it return double and we need integer 
            Sum += (int)Math.pow(i,3);

        }

        System.out.println("Basic logic Sum: "+Sum);
        
        
        //     2nd Approach
        // Using Recursion
        System.out.println("Recusion logic1: "+Sum1(1, N));

        //     3nd Approach
        // Using Recursion
        System.out.println("Recusion logic2: "+Sum2(N));


        scn.close();
        
    }
}
