import java.util.Scanner;

public class Factorial {
    public static void fact(int a){
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact = fact*i;
        }
        System.out.print("the factorial of a number : " + fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        fact(n);
    }
    
}
