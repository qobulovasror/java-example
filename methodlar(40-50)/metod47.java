// doiraning yuzini topuvchi funksiya tuzing
import java.util.Scanner;
public class metod47 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("K: "); double K = in.nextDouble();
        
        System.out.println(myFunction(K));
    }
    public static double myFunction(double a){
        return Math.PI*a*a;
    }
}

