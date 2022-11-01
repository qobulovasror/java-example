// fibunachi sonnig n elementini topuvchi funksiya tizing
import java.util.Scanner;
public class metod50{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("K: "); int K = in.nextInt();
        
        System.out.println("Natija: " + myFunction(K));
    }
    public static int myFunction(int a){
        int k=1,i=1,l=0,j=2;
        while(j<a){
            l=i+k;
            k=i;
            i=l;
            ++j;
            System.out.println(l);
        }
        return l;
    }
}

