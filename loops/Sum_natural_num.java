import java.util.*;
public class Sum_natural_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.print("sum of all natural number between 0 to n  :  " + sum);
    }
}


// by using while loop
// import java.util.*;
// public class Sum_natural_num {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         int sum = 0;
//         int i=1;
//         while(i<=n){
//             sum = sum + i;
//             i++;
//         }
//         System.out.print("sum of all natural number between 0 to n  :  " + sum);
//     }
// }
