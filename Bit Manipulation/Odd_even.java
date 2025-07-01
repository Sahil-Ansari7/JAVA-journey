import java.util.*;
public class Odd_even {
    public static void OddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number.");
        }
        else{
            System.out.println("Odd Number.");
        }
    }
    public static void main(String[] args) {
        OddorEven(3);
        OddorEven(10);
        OddorEven(2933921);
    }
}
