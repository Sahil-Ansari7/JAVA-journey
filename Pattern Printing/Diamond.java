// import java.util.*;
// public class Diamond {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         int a = 1;
//         for(int i=1; i<=n; i++){
//             for(int k=1; k<=n-i; k++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=a; j++){
//                 System.out.print("* ");
//             }
//             a = a + 2;
//             System.out.println();
//         }
//             a = a - 4;

        
//         for(int i=1; i<=n; i++){
           
//             for(int k=1; k<=i; k++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=a; j++){
//                 System.out.print("* ");
//             }
//             a = a - 2;
//             System.out.println();
//         }
//     }
// }








import java.util.*;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int nsp = n/2;
        int nst = 1;
        int ml = n/2+1;
        for(int i=1; i<=n+1; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=nst; k++){
                System.out.print("* ");
            }
            if(i<ml){
                nsp--;
                nst+=2;
            } else{
                nsp++;
                nst-=2;
            }

            System.out.println();
        }
        
        
    }
}
