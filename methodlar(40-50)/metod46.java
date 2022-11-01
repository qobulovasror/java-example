// kitilgan K sonni oxiriga N raqamini qo'shuvchi fuksiya tuzing 
import java.util.Scanner;
public class metod46 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("K: "); int K = in.nextInt();
        System.out.print("N: "); int N = in.nextInt();
        
        System.out.println(myFunction(K, N));
    }
    public static int myFunction(int a, int b){
        return a*10+b;
    }
}
