package JavaCore;

import java.util.Scanner;

public class HW_02 {
    public static void main(String[] args) {
        System.out.println(w1(3, 6));
        System.out.println(z2(0));
        System.out.println(z3(-4));
        z4("Hello", 5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи год => ");
        System.out.println(z5(sc.nextInt()));
        sc.close();
    }

    public static boolean w1(int a, int b) {
        return ((a + b) <= 20 && (a + b) > 10) ? true : false;
    }

    public static String z2(int a) {
        return a >= 0 ? "Положительное" : "Отрицательное";
    }

    public static boolean z3(int a) {
        return a >= 0 ? true : false;
    }

    public static void z4(String s, int a) {
        for (int i = 0; i < a; i++)
            System.out.println(s);
    }

    public static boolean z5(int a) {
        return (a % 4 == 0 && a % 100 != 0) || a % 400 == 0  ? true : false;
    }

}
