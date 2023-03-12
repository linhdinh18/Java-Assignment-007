/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
 */
import java.util.Scanner;

public class MyMath {

    public static void gcf() {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = s.nextInt();
        System.out.println("Enter b: ");
        b = s.nextInt();
        int c = 0;
        while (b != 0) {
            if (a > b){
                c = b;
                b = a % b;
                a = c;
            } else {
                b %= a;
            }
        }
        System.out.println("The GCF of a and b is: " + c);
    }



    public static void main(String[] args) {
        gcf();
    }

}
