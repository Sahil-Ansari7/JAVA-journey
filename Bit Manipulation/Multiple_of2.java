import java.util.*;
public class Multiple_of2 {

    //check the number is multiple of 2 or not.
    public static void isMultiple_of2(int n){
        if((n & (n-1)) == 0){
            System.out.println("the number is multiple of 2.");
        }
        else{
            System.out.println("the number is not multiple of 2.");

        }
    }
    public static void main(String[] args) {
        isMultiple_of2(15);
        isMultiple_of2(16);
    }
}
