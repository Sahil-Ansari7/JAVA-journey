// package JAVA.Functions;

import java.util.*;
public class SwapNum {

    public static void swap(int a,int b){
        int k;
        k=a;
        a=b;
        b=k;
        System.out.println("After swaping this number : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        swap(a, b);
       
    }    
}
