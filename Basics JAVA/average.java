import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a : ");
        float a = sc.nextFloat();
        System.out.print("Enter a number b : ");
        float b = sc.nextFloat();
        System.out.print("Enter a number c : ");
        float c = sc.nextFloat();
        float average = (a+b+c)/3;
        System.out.print("average of number a,b and c : ");
        System.out.print(average);
    }
   
}
