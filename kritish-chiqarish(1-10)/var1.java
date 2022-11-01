// X kg konfet A so'm. 1kg va Y kg konfet qancha turadi ? 
import java.util.Scanner;
public class var1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("X: ");
        int X = in.nextInt();

        System.out.print("A: ");
        int A = in.nextInt();

        System.out.print("Y: ");
        int Y = in.nextInt();

        float C = (float) A/X * (Y+1);
        System.out.print("C: " + C);

    }
}
