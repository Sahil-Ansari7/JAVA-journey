import java.util.*;
public class BinomialCoef {
    public static int fact(int a){
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact = fact*i;
        }
        return fact;
        // System.out.print("the factorial of a number : " + fact);
    }

    public static int Bino(int n,int r){
    int rfact = fact(r);
    int nfact = fact(n);
    int nrfact = fact(n-r);
    int BC = nfact/(rfact*nrfact);
    // System.out.print("Binomial coefficient : " + BC);
    return BC;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = sc.nextInt();
        System.out.print("Enter a number r : ");
        int r = sc.nextInt();
        
        System.out.print("answer : " + Bino(n, r));
    }
}
