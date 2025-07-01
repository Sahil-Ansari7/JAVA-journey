import java.util.*;
public class Stock {

    public static int stocks(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=1; i<price.length; i++){
            if(buyprice<price[i]){
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit , profit);
            }
            else{
                buyprice = price[i];
            }
        }
        return maxprofit;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element on array : ");
        int n = sc.nextInt();
        int[] price = new int[n];
        for(int i=0; i<price.length; i++){
            System.out.print("price["+i+"] = ");
            price[i] = sc.nextInt();
        }
        
        System.out.println("Maximum profit : " + stocks(price));
    }
}
