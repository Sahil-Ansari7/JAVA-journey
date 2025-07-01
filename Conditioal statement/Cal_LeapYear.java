import java.util.*;
public class Cal_LeapYear {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter year : ");
    int n = sc.nextInt();
    if(n % 400 == 0){
        System.out.print("The given year is Leap year.");
    } else if(n % 100 == 0){
            System.out.print("The given year is not Leap year.");
    } else if(n % 4 == 0){
            System.out.print("the given year is Leap year.");
        }else {
            System.out.print("the given year is not Leap year.");
        }

    }
}



// import java.util.Scanner;

// public class LeapYearChecker {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Ask the user to enter a year
//         System.out.print("Enter a year: ");
//         int year = scanner.nextInt();

//         // Check if the year is a leap year
//         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//             System.out.println(year + " is a leap year.");
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }

//         scanner.close();
//     }
// }







//solve by using nested if else 
// import java.util.Scanner;

// public class LeapYearNestedIf {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Taking year input from the user
//         System.out.print("Enter a year: ");
//         int year = scanner.nextInt();

//         // Using nested if-else to check leap year
//         if (year % 4 == 0) {
//             if (year % 100 == 0) {
//                 if (year % 400 == 0) {
//                     System.out.println(year + " is a leap year.");
//                 } else {
//                     System.out.println(year + " is not a leap year.");
//                 }
//             } else {
//                 System.out.println(year + " is a leap year.");
//             }
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }

//         scanner.close();
//     }
// }