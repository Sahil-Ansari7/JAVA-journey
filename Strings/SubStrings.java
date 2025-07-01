import java.util.*;
public class SubStrings {
    public static String SubStrings(String str, int si, int ei){
        String Substr = "";
        for(int i=si; i<ei; i++){
            Substr += str.charAt(i);
        }
        return Substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld!";
        
        System.out.print(SubStrings(str,0,5));


        // isme ek inbuilt substring ko nikalne ke liye function hota hai.
        System.out.print(str.substring(0,5));
    }
}
