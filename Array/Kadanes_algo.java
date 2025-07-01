import java.util.*;
public class Kadanes_algo {

    public static void Kadanes_algo(int arr[]){
        int MaxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];
            if(currSum<0){
                currSum = 0;
            }
            MaxSum = Math.max(MaxSum, currSum);
        }
        System.out.println("the Maximum Sub Array sum : " + MaxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
        Kadanes_algo(arr);
    }
}
