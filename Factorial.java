import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a;
        long s = 1;
        System.out.println("Введите положительное число ");
        a = in.nextInt();
        if (a == 0); {
            s = 1;
        }
        do {
            if (a > 0) {
                s = s * a;
                a = a - 1;
            }
        } while (a > 0);
        System.out.println("Факториал: " + s);
    }
}
