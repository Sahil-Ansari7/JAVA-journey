import java.util.Arrays;
import java.util.Collections;
public class inbuilt_reverse_sort_arr {

     public static void printarr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr, Collections.reverseOrder());
        printarr(arr);

    }
}



// //sort b/w range.
// import java.util.Arrays;
// import java.util.Collections;
// public class inbuilt_reverse_sort_arr {

//      public static void printarr(Integer arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + "  ");
//         }
//     }
//     public static void main(String[] args) {
//         Integer arr[] = {5,4,1,3,2};
//         Arrays.sort(arr,0,4, Collections.reverseOrder());
//         printarr(arr);

//     }
// }

