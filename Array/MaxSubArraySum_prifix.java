import java.util.*;
public class MaxSubArraySum_prifix {
    public static void MaxSubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                
                // System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
            
            
        }
        System.out.println("the Maximum Sub Array sum : " + maxSum);
    }
    public static void main(String[] args) {
        
        // iska use input lene ke liye kiya jata hai.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter no of element on array : ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<arr.length; i++){
        //     System.out.print("arr["+i+"] = ");
        //     arr[i] = sc.nextInt();
        // }

        int arr[] ={-3 , 4 , 5 ,-2, 2 , 1};
        MaxSubArraySum(arr);

    }
    
}