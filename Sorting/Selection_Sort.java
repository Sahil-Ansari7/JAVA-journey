import java.applet.*;
public class Selection_Sort {
    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                //increasing order ke liye 
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
                // Decreasing order ke liye 
                
                // if(arr[minpos] > arr[j]){
                //     minpos = j;
                // }
            }
            //Swap...
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    //print final array
    public static void answer(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        SelectionSort(arr);
        answer(arr);
    }
}
