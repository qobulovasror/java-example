//Ikki o'lchamli massiv yarating. 
//Har bir i- satri i*10 ga teng bo'lsin.
import java.util.Scanner;
public class array61 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("n:"); int n = in.nextInt();
        System.out.print("m:"); int m = in.nextInt();
        int arr[][] = new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = 10*i;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}


// import java.util.Scanner;
// public class array61 {
//     public static void main(String[] arg){
//         Scanner in = new Scanner(System.in);
//         System.out.print("n:"); int n = in.nextInt();
//         int s=0,i,k=n%7,h=n/7;
//         for(i=0;i<h;i++){
//             s+=28+7*i;
//         }
//         for(i=1;i<=k;i++){
//             s+=h+i;
//         }
//         System.out.println(s);
//     }
// }