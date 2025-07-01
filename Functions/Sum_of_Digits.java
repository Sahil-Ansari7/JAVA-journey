import java.util.*;
public class Sum_of_Digits {
    public static void Sum_of_Digits(int n){
        int r = 0; 
        int sum = 0;
        while(n>0){
            r = n%10;
            sum = sum + r;
            n = n/10; 
        }


        // for loop se nahi hota hai
        // for(int i=1; i<=n; i++){
        //     r = n%10;
        //     sum = sum + r;
        //     n = n/10; 
        // }

        
        System.out.print("the sum of digits of a number : " + sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
            int n = sc.nextInt();
        Sum_of_Digits(n);
    }
}
