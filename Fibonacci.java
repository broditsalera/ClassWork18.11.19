import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a;
        long b = 0;
        long c = 1;
        long s = 0;
        System.out.println("Введите положительное число ");
        a = in.nextInt();
        for (long i = 2; i <= a; ++i) {
            s = b + c;
            b = c;
            c = s;
        }
        System.out.println("Число Фибоначчи: " + c);
    }
}