
// https://www.mathsisfun.com/numbers/factorial.html




import java.util.*;

public class Find_all_factorial_numbers_less_than_or_equal_to_n {

    public static void factorial(int fact, int i, int n ){
        if(fact>n){
            return;
        }

        System.out.print(fact + " ");
        factorial(fact*i, i+1, n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number: ");
        int N = scn.nextInt();

        // 1st Basic Approach 
        System.out.print("Basic Approach ");
        int fact = 1;

        for(int i=2; fact<=N; i++){
            System.out.print(fact + " ");
            fact = fact * i;
        }

        // 2nd Recursive Approach
        System.out.print("\nRecusive  Approach \nfact ");
        factorial(1,2,N);
    








        scn.close();
        
    }
}