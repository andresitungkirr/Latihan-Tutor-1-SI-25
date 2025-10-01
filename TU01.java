import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, hJ, hP;

        x = Integer.parseInt(input.nextLine());
        y = Integer.parseInt(input.nextLine());
        if (x % 2 == 0) {
            System.out.println(Integer.toString(x) + " adalah bilangan Genap");
        } else {
            System.out.println(Integer.toString(x) + " adalah bilangan Ganjil");
        }
        if (y % 2 == 0) {
            System.out.println(Integer.toString(y) + " adalah bilangan Genap");
        } else {
            System.out.println(Integer.toString(y) + " adalah bilangan Ganjil");
        }
        if (x < y) {
            System.out.println(Integer.toString(y) + " lebih besar dari " + x);
        } else {
            if (x == y) {
                System.out.println(Integer.toString(x) + " sama dengan " + y);
            } else {
                System.out.println(Integer.toString(x) + " lebih kecil dari " + y);
            }
        }
        if (x % 2 == 0 && y % 2 == 0) {
            hJ = x + y;
            System.out.println("x+y= " + hJ);
        } else {
            if (x % 2 == 0 && y % 2 == 0 && x % 2 != 0 && y % 2 != 0) {
                hP = x * y;
                System.out.println("x*y= " + hP);
            } else {
                System.out.println("Berbeda Jenis");
            }
        }
    }
}
