import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number a : ");
        int a = sc.nextInt();

        System.out.print("enter operator : ");
        char operator = sc.next().charAt(0);

        System.out.print("enter number b : ");
        int b = sc.nextInt();

        switch(operator) {
            case '+' : System.out.println(a+b);
                        break;

            case '-' : System.out.println(a-b);           
                        break;

            case '*' : System.out.println(a*b);
                        break;

            case '/' : if(b==0){
                         System.out.println("not defined.");
                              break;
                       }else{
                              System.out.println(a/b);
                                break;
                        }   
                        
                        
            case '%' : if(b==0){
                         System.out.println("not defined.");
                         }else{
                               System.out.println(a%b);
                                 break;
                        }         
        }
    }
}
