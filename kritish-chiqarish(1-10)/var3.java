// A son berilgan. A^2, A^3, A^6 ni topish
import java.util.Scanner;
public class var3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("A: ");
        int A = in.nextInt();
        System.out.println("A^2: "+ Math.round(Math.pow(A,2)));
        System.out.println("A^3: "+ Math.round(Math.pow(A,3)));
        System.out.println("A^6: "+ Math.round(Math.pow(A,6)));

    }
}
