import java.util.*;
public class Basics_of_Strings{
    public static void main(String[] args) {
        char arr[] ={'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings are immutable
        Scanner sc = new Scanner(System.in);

        // isase keval 1 word print hota hai.
        // String Name = sc.next();

        String Name = sc.nextLine();
        System.out.println(Name);




        // iske dwara ham String ki length find karte hai.

        // String Name = "Sahil Ansari";
        // System.out.println(Name.length());


        //concatination  (adding of 2 or more Strings.)
        String firstName = "Sahil";
        String lastName = "Ansari";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

    }
}
