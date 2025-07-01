import java.util.*;
public class palindromeNum {
    public static void palindrome(int n){
        int temp = n;
        int rev = 0;
        int r = 0;
        while( temp!=0){
           r= temp%10;
           rev = (rev*10)+r;
           temp=temp/10;
        }
        
        // System.out.print(rev);
        if(n == rev){
            System.out.print("given num is palindrome.");
        } else{
            System.out.print("given num is not palindrome.");
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        palindrome(n);
       
        
    }
}
