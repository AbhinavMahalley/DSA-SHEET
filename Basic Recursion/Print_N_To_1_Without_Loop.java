import java.util.Scanner;

public class Print_N_To_1_Without_Loop {
    
    public static void printNto1(int N){

        //if N = 0 & 0<1 we return back
        if(N < 1) return; 
        
        //Print value of N 1st
        System.out.println(N); 

        // then call recursive function ( Function which call it self)
        printNto1(N-1);
        
    }

    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        //Call to function
        printNto1(n);
        
        scn.close();

    }
}
