import java.util.*;
public class Average_of3Num {
    public static float average(int a,int b,int c){
        float m = (a + b + c)/3.0f;
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a : ");
        int a = sc.nextInt();
        System.out.print("enter number b : ");
        int b = sc.nextInt();
        System.out.print("enter number c : ");
        int c = sc.nextInt();
        System.out.print("Average of 3 numbers : " + average(a, b, c));
    }
}
