//n son berilgan. S= 1 + 1/2 + 1/3 + .. + 1/n
import java.util.Scanner;
public class for36 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        int s=0;
        for(int i=1; i<=n; i++){
            s+=1/i;
        }
        System.out.println(s);
    }
}