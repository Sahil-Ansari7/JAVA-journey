import java.util.*;
public class print_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int table;
        for(int i=1; i<=10; i++){
            table = n * i;
            System.err.println(n + " x " + i + " = " + table);
        }
    }    
}
