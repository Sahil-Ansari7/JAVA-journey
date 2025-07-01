// import java.util.*;


// public class primeNum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a no. : ");
//         int n = sc.nextInt();
//         int a=0;
        
//         for(int i=2; i<=n; i++){
//             for(int j=2; j<i; j++){
//                 if(i%j==0){
//                   a=1;
//                     break;
//                 } 
//             }
//             if(a==0){
//                 System.out.println(i);
//             }
//            a=0;
//         }

//     }
// }




import java.util.*;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers between 1 and " + n + " are:");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) { // More efficient
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}