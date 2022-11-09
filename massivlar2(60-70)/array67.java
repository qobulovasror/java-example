//m, n o'lchamli massiv berilgan. 
//har bir satrning eng kichik elementlari
import java.util.Scanner;
public class array67 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("n:"); int n = in.nextInt();
        System.out.print("m:"); int m = in.nextInt();
        int arr[][] = new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = (int) Math.ceil(Math.random()*10);
            }
        }
        for(int i=0;i<n;i++){
            int maxI = arr[i][0];
            for(int j=1;j<m;j++){
                if(arr[i][j]>maxI)
                    maxI=arr[i][j];
            }
            System.out.println(maxI);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print('\n');
        }
    }
}
