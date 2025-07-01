import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("pencil rate : ");
        float a = sc.nextFloat();
        System.out.print("pen rate : ");
        float b = sc.nextFloat();
        System.out.print("eraser rate : ");
        float c = sc.nextFloat();

        System.out.println("\n\n       BILL      ");
        System.out.print("pencil rate : ");
        System.out.println(a);
        System.out.print("pen rate : ");
        System.out.println(b);
        System.out.print("eraser rate : ");
        System.out.println(c);
        System.out.print("GST on all product 18% : ");
        float d = ((a+b+c)*18)/100;
        System.out.println(d);
        System.out.print("TOTAL : ");
        System.out.print(a+b+c+d);
    }
}
