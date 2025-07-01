import java.util.*;
public class Operations {
    public static void getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            System.out.println("Ith position bit = 0 ");
        }
        else{
            System.out.println("Ith position bit = 1 ");

        }
    }

    // Ith bit 0 or 1 ko change into --> 1.
    public static int SetIthBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    // Ith bit 0 or 1 ko change into --> 0. 
    public static int ClearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }


    // iska use Ith bit ko update karne ke liye kiya jata hai.
    public static int UpdateIthBit(int n, int i, int NewBit){
        // pahla tareeka
        // if(NewBit == 0){
        //     return ClearIthBit(n , i);
        // }
        // else{
        //     return SetIthBit(n , i);
        // }
        
        // Dusra tareeka
        n = ClearIthBit(n , i);
        int BitMask = NewBit << i;
        return n | BitMask;
    }

    // last se i bit ko clear karke 0 karta hai
    public static int ClearIBits(int n, int i){
        int BitMask = (~0) << i;
        return n & BitMask;
    }


    // ye binary number ke beech kisi range ki value ko clear (0) karta hai.
    public static int ClearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int BitMask = a|b;
        return n & BitMask;
    }


    //check the number is multiple of 2 or not.
    public static void isMultiple_of2(int n){
        if((n & (n-1)) == 0){
            System.out.println("the number is multiple of 2.");
        }
        else{
            System.out.println("the number is not multiple of 2.");

        }
    }

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
        getIthBit(10, 2);
        getIthBit(10, 3);

        System.out.println(SetIthBit(10, 2));
        
        System.out.println(ClearIthBit(10, 1));

        System.out.println("After updateBit : " + UpdateIthBit(10, 2, 1));

        System.out.println("i Bits tak clear karne ke baad : " + ClearIBits(15, 2));

        System.out.println("After clear Bits in Range : " + ClearBitsInRange(10, 2, 4));

        isMultiple_of2(64);
        isMultiple_of2(15);

        CountSetBits(15);
        CountSetBits(63272);
    }
}
