import java.util.*;
public class reverseNum {

    public static void reverseNum(int arr[]){
        int start = 0 , end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter num 0f element on array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }


        reverseNum(arr);
        System.out.println("reverse of a array : ");
        for(int i=0; i<arr.length; i++){
            
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        
    }
}
