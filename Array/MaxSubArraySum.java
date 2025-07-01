import java.util.*;
public class MaxSubArraySum {
    public static void MaxSubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum +=arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
            
            
        }
        System.out.println("the Maximum Sub Array sum : " + maxSum);
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
        MaxSubArraySum(arr);

    }
}
