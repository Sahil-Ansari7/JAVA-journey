import java.util.*;
public class print_reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        int rev=0;
        int lastdigit;
        while(n>0){
            lastdigit = n % 10;
            rev = (rev*10)+lastdigit;
            n=n/10;
        }
        System.out.print("reverse of a given number :" + rev);
        }
        
    }