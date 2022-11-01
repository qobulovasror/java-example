// n soni berilgan. (1+2+3+ ... k)>=n shartni bajaruvchi eng kichik k son topish
import java.util.Scanner;
public class while39 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        int k=1,i=0;
        while(i<n){
            k++;
            i+=k;
        } 
        System.out.print(k);
    }
}
