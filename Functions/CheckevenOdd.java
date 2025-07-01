import java.util.*;
public class CheckevenOdd {
    public static void EvenOdd(int n){
        if(n%2==0){
            System.out.print("Even.");
        }
        else{
            System.out.print("Odd.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n : ");
        int n = sc.nextInt();
        EvenOdd(n);
    }
}
