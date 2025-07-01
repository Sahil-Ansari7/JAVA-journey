// import java.util.*;
// public class prime_num_inRange {
//     public static void prime(int n){
//           int a=0;
//         for(int i=2; i<=n; i++){
           
//            for(int j=2; j<i; j++){
//             if(i%j==0){
//                 a=1;
//                 break;
//             }
//            }
//            if(a==0){
//             System.out.println(i);
//            }
//            a=0;
           
//         }
        
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         prime(n);
//     }
// }







import java.util.*;
public class prime_num_inRange {
    public static boolean isprime(int n){
        boolean isprime = true;
        for(int i=2; i<=n; i++){
            for(int j=2; j<i; j++){
               if(i%j==0){
                isprime = false;
                break;
               }
            }
            if(isprime==true){
                System.out.println(i);
               }
               isprime = true;
        }
        return isprime;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        isprime(n);
    }
}
