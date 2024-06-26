import java.util.*;


public class Print_1_To_N_Without_Loop {

    public static void print1toN(int N){
        if(N < 1) return;//base/edge condition

        print1toN(N-1);//function
        System.out.println(N);//print
        
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        print1toN(n);
        
        scn.close();


    }
    
}

