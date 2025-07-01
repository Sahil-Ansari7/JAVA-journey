import java.util.*;
public class Count_Set_Bit {
    // binary me kitne 1 hai usko count karne ke liye. setBit  = 1
    public static void CountSetBits(int n){
        int count = 0;
        while (n > 0) {
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        System.out.println("the number of Set Bits : " + count);
    }

    public static void main(String[] args) {
        CountSetBits(15);
        CountSetBits(63);
        CountSetBits(876752);
    }
}
