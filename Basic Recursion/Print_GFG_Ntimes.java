import java.util.Scanner;

public class Print_GFG_Ntimes {

    public static void printGFG_Ntimes(int N){

        //if N = 0 & 0<1 we return back
        if(N < 1) return; 
        
        //Print GFG until N=0
        System.out.println("GFG"); 

        // then call recursive function ( Function which call it self)
        printGFG_Ntimes(N-1);
        
    }

    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        //Call to function
        printGFG_Ntimes(n);
        
        scn.close();

    }
    
}
