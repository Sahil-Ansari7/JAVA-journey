import java.util.*;
public class largest_in_3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a : ");
        int a = sc.nextInt();
        System.out.print("enter number b : ");
        int b = sc.nextInt();
        System.out.print("enter number c : ");
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.print("a is greater th b and c.");
        }
        else if(b > a && b > c){
            System.out.print("b is greater than a and c.");
        } else{
            System.out.print("c is greater than a and b.");
        }
    }
    
}
