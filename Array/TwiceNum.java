import java.util.*;
public class TwiceNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.print("price["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        int idx = -1;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    idx = 0;
                    break;
                }
                
            }
            
        }
        if(idx==0){
            System.out.println("True.");
        }
        else{
            System.out.println("False.");
        }
    }
}
