// import java.util.*;
// public class Mast_Num_Pyramid {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of line : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             int a=i;
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print(a+" ");
//                 a--;
//             }
//             for(int l=2; l<=i; l++){
//                 System.out.print(l+" ");
//             }
//             System.out.println();
//         }
//     }
// }






import java.util.*;
public class Mast_Num_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
           
            for(int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
              
            }
            int a=i-1;
            for(int l=1; l<=i-1; l++){
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
    }
}

