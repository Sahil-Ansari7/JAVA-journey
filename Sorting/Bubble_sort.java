import java.util.*;
public class Bubble_sort{
    public static void Bubble(int arr[]){
        for(int turn=0; turn<arr.length; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
     static void answer(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2,34,7,6,12};
        Bubble(arr);
        answer(arr);
        
    }
}