import java.util.*;
public class Fast_Exponential {
    public static void FastExpo(int a, int n){
        int ans = 1;
        while (n > 0) {
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        System.out.println(" a to the power n : " + ans);
    }
    public static void main(String[] args) {
        FastExpo(2, 5);
        FastExpo(5, 4);
        
    }
}
