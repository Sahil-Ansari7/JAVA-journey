import java.util.*;
public class Pair_in_array {

    public static void pair(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of element on array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }

        pair(arr);
    }
}
