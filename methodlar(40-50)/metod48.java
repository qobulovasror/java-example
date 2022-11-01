// funksiya argumenti da class dan foydalanish
import java.util.Scanner;

class Test {
    int son;
}
public class metod48 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("son: "); int son = in.nextInt();
        Test s = new Test();
        s.son = son;
        System.out.println(s.son);
        myFunction(s);
        System.out.println(s.son);
    }
    public static void myFunction(Test a){
        a.son = 200;
    }
}

