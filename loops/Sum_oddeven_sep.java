import java.util.*;
public class Sum_oddeven_sep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int c;
        int evenSum = 0;
        int oddSum = 0;
        do{
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            if(n%2==0){
                evenSum = evenSum + n;
            }
            else{
                oddSum = oddSum +n;
            }
            System.out.print("for continue press 1 and exit for press 0 :");
            c = sc.nextInt();
        }
        while(c==1);
            System.out.println("the sum of even number : " + evenSum);
            System.out.print("the sum of odd number : " + oddSum);
        
        
    }    
}
