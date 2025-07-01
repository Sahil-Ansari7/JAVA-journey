import java.util.*;
public class Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array numbers : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        for(int i=0; i<arr.length; i++){
            System.out.print("price["+i+"] = ");
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[0]){
                max=arr[i];
            }
            if(arr[i]<arr[0]){
                min=arr[i];
            }
        }
        System.out.println("The span of given array : " + (max-min));
    }    
}
