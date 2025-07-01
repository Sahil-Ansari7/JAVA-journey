import java.util.*;
public class Prime_num_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        int a=0;
        for(int i=2; i<n; i++){
            if(n%i==0){
                a=1;
                break;
            }
        }
        if(n==0 || n==1){
            System.out.println("niether prime nor composite.");
        }
        else if(a==0){ System.out.println("prime.");
        }
        else{
            System.out.println("composite.");
        }
    }
  

}
