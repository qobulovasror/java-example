//m, n o'lchamli massiv va k son berilgan. 
//k satr elimentlarini yig'ingisi va ko'paytmasini chiqarish
import java.util.Scanner;
public class array64 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("n:"); int n = in.nextInt();
        System.out.print("m:"); int m = in.nextInt();
        System.out.print("k:"); int k = in.nextInt();
        int arr[][] = new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = (int) Math.ceil(Math.random()*10);
            }
        }
        int s=0,l=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(k==i+1){
                    s+=arr[i][j];
                    l*=arr[i][j];
                }
            }
        }
        System.out.print("s: "+s+" k: "+l );
    }
}
