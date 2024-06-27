import java.util.*;

public class Valid_Palindrome {

       public static boolean isPalindrome(int start, int end, String str){
        // "a"
        if(start == end) return true;
            //      0           4
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

       if(start <= end+1)
         return isPalindrome(start+1, end-1, str);


           return true;
        }

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter string : ");
        
        String str = scn.nextLine();
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("1st Approach ");
        int start = 0;
        int end = str.length()-1;
        
        boolean isPal = true;
        
        while (start <= end) {
            
            if(str.charAt(start) != str.charAt(end)){
                isPal = false;
                break;
            }
            start++;
            end--;
        }
        
        System.out.println("IsPal=  "+isPal);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("2nd Approach ");
        
        System.out.println("IsPal=  "+ isPalindrome(0,str.length()-1,str));

        

        scn.close();
        
    }
}
