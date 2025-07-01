import java.util.*;
public class FInd_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of element in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.print("price["+i+"] = ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int idx = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[0]){
                max = arr[i];
                idx = i;
            }
            
        }
        System.out.println("The index of max num : " + idx);
        System.out.print("The max value of array : " + max);
    }
}
