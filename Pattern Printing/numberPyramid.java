// import java.util.*;
// public class numberPyramid {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of line : ");
//         int n = sc.nextInt();
//         int a=1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=a; k++){
//                 System.out.print(i+"   ");
//             }
//             a+=1;
//             System.out.println();
//         }
//     }
// }






// import java.util.*;
// public class numberPyramid {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of line : ");
//         int n = sc.nextInt();
//         int a=1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=a; k++){
//                 System.out.print(i+" ");
//             }
//             a+=2;
//             System.out.println();
//         }
//     }
// }




// import java.util.*;
// public class numberPyramid {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of line : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print(i+"   ");
//             }
           
//             System.out.println();
//         }
//     }
// }




// import java.util.*;
// public class numberPyramid {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of line : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print(k+"   ");
//             }
           
//             System.out.println();
//         }
//     }
// }






import java.util.*;
public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line : ");
        int n = sc.nextInt();
        int a=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=a; k++){
                System.out.print(k+" ");
            }
            a+=2;
            System.out.println();
        }
    }
}
