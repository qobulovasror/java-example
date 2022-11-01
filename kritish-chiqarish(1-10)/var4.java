// farangetdda tempraturani gradus sersiga utqazish 
import java.util.Scanner;
public class var4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("F: ");
        float F = in.nextFloat();
        float C = (F-32)+5/9;
        System.out.print("C: " + C);

    }
}
