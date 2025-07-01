import java.util.*;
public class DigonalSum {
    public static void DigonalSum(int matrix[][]){
        int sum = 0;

        // Iska time complexity o(n2) hai
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<=matrix[0].length; j++){
        //         if(i==j){
        //             sum =sum + matrix[i][j];
        //         }
        //         if(i+j==matrix.length-1){
        //             sum = sum + matrix[i][j];
        //         }
        //     }
        // }

        // Iska time complexity o(n) hai
        for(int i=0; i<matrix.length; i++){
            //pri Diagonal
            sum += matrix[i][i];
            // secondary Diagonal
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        DigonalSum(matrix);
    }
}
