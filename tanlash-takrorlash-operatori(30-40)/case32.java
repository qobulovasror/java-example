//1-7 gacha sonlar berilgan mos ravishda hafta kunlarini chiqarish kerak
import java.util.Scanner;
public class case32 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int a = in.nextInt();
        switch(a){
            case 1: System.out.print("Dushanba"); break;
            case 2: System.out.print("Seshanba"); break;
            case 3: System.out.print("Chorshanba"); break;
            case 4: System.out.print("Payshanba"); break;
            case 5: System.out.print("Juma"); break;
            case 6: System.out.print("Shanba"); break;
            case 7: System.out.print("Yakshanba"); break;
            default : System.out.print("Xato raqam");
        }
    }
}
