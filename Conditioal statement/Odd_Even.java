import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.print("The given number is Even.");
        } else{
            System.out.print("The given number is Odd.");
        }
    }
    
}
