import java.util.Scanner;

public class barStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element on array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
       
        for(int floor=max; floor>=1; floor--){
            for(int j=0; j<arr.length; j++){
                if(arr[j]>=floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
