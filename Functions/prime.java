// import java.util.*;
// public class prime {
//     public static void prime(int n){
//         int a = 0; 
//         for(int i=2; i<n; i++){
//             if(n%i==0){
//                 a=1;
//                 break;
//             }
//         }
//         if(n==0 || n==1){
//             System.out.print("niether prime nor composite.");
//         }
//             else if(a==0){
//                 System.out.print("prime.");
//             } 
//                 else{
//                     System.out.print("composite.");
//                 }
//     }    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         prime(n);
//     }
// }








// import java.util.*;
// public class prime {
//     public static boolean isprime(int n){
//         boolean isprime = true; 
//         for(int i=2; i<n; i++){
//             if(n%i==0){
//                 isprime = false; 
//                 break;
//             }
//         }
//         return isprime;
        
//     }    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         System.out.print(isprime(n));
//     }
// }







import java.util.*;
public class prime {
    public static boolean isprime(int n){
        boolean isprime = true; 
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isprime = false; 
                break;
            }
        }
        return isprime;
        
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print(isprime(n));
    }
}