import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.time.chrono.IsoEra;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import org.xml.sax.InputSource;

public class JR {
    public static void main(String[] args) {
        // zadacha24(); // zadacha41(10); // zadacha42(10, 20); // zadacha43(); //
        // zadacha44(); // zadacha51(5); // zadacha63(); // zadacha64();
        // zadacha65();
        // zadacha67(7, 4, 8);
        System.out.println(zadacha68(3));

    }

    public static void zadacha24() {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        boolean br = true;
        while (br) {
            System.out.print("Введи температуру => ");

            if (sc.hasNextInt() == true) {
                temp = sc.nextInt();
                br = false;
            }

        }
        System.out.println(temp >= 0 ? "тепло" : "холодно");

    }

    public static void zadacha41(int count) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String dd = "";
        while (true) {
            System.out.print("Vvedi chislo ili END => ");
            if (sc.hasNextInt())
                sum += sc.nextInt();
            else
                dd = sc.nextLine();
            if (dd.equalsIgnoreCase("end")) {
                break;
            }
        }
        System.out.println(sum);
    }

    public static void zadacha42(int a, int b) {
        while (a > 0) {
            int c = b;
            while (c > 0) {
                if (a == 10 || a == 1) {
                    System.out.print("Q");
                } else {
                    if (a < 10 && a > 1 && (c == b || c == 1)) {
                        System.out.print("Q");
                    } else {
                        System.out.print(" ");
                    }
                }
                c--;
            }
            System.out.println();
            a--;
        }
    }

    public static void zadacha43() {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int mtwo = sc.nextInt();
        if (min > mtwo) {
            int temp = min;
            min = mtwo;
            mtwo = temp;
        }
        while (sc.hasNextInt()) {
            int value = sc.nextInt();
            if (value < min) {
                mtwo = min;
                min = value;
            }
        }

        System.out.println("MIN Vtoroe => " + mtwo + "      " + min);
        sc.close();
    }

    public static void zadacha44() {
        int[] array1 = { 0, 1, 2, 3, 4 };
        int[] array2 = { 5, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        System.out.println(Arrays.toString(array));
        for (int i = array1.length; i < array.length; i++) {
            array[i] = array2[i - array1.length];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void zadacha51(int arrayLong) {
        int[] array = new int[arrayLong];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи числа => ");
        for (int i = 0; i < array.length; i++) {
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
            } else {
                System.out.println("Это не число ");
                continue;
            }
        }
        int temp;
        System.out.println(Arrays.toString(array));
        int[] array2 = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("------------------");
        System.out.println(Arrays.toString(array2) + " <= array2");
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }

    public static void zadacha63() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Введи целое цисло => ");
        n = sc.nextInt();
        int[] array = new int[n];

        if (n >= 0 && n % 2 != 0) {
            array[0] = n;
            for (int i = 1; i < array.length; i++) {
                System.out.println("Введи целое цисло => ");
                array[i] = sc.nextInt();
            }
        } else if (n >= 0 && n % 2 == 0) {
            array[n - 1] = n;
            for (int i = n - 2; i >= 0; i--) {
                System.out.println("Введи целое цисло => ");
                array[i] = sc.nextInt();
            }

        }

        System.out.println(Arrays.toString(array));
    }

    public static void zadacha64() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи длину массива => ");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        System.out.println("Введи элементы массива => ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        int min = array1[0];
        int max = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        for (int i : array1) {
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("минимальное число в массиве => %d \n", min);
        System.out.printf("максимальное число в массиве => %d", max);
    }

    public static void zadacha65() {
        String[] arrayS = { "Hello", "Hello", "World", "Java", "Tasks", "World" };
        System.out.println(Arrays.toString(arrayS));

        // int[] ars = new
        for (int i = 0; i < arrayS.length; i++) {
            String stemp = arrayS[i];
            for (int j = i + 1; j < arrayS.length; j++) {
                if (stemp == null) {
                    break;
                }
                if (stemp.equals(arrayS[j])) {
                    arrayS[i] = null;
                    arrayS[j] = null;
                }
            }
        }

        System.out.println(Arrays.toString(arrayS));

    }

    public static void zadacha66() {
        int[][] MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i < MULTIPLICATION_TABLE.length + 1; i++) {
            for (int j = 1; j < MULTIPLICATION_TABLE.length + 1; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
            }
        }
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            System.out.println(Arrays.toString(MULTIPLICATION_TABLE[i]));
        }
        System.out.println("----------------------------------");
        int[][] array = new int[10][];
        for (int i = 0; i < 10; i++) {
            array[i] = new int[i + 1];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void zadacha67(int longArrya, int valueStart, int valueEnd) {
        int[] array = new int[longArrya];
        if (array.length % 2 == 0) {
            Arrays.fill(array, 0, array.length / 2, valueStart);
            Arrays.fill(array, array.length / 2, array.length, valueEnd);
        } else {
            Arrays.fill(array, 0, array.length / 2 + 1, valueStart);
            Arrays.fill(array, array.length / 2 + 1, array.length, valueEnd);
        }

        System.out.println(Arrays.toString(array));
    }

    public static int zadacha68(int cube) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[array.length - 1 - i] = array[i];
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("----------------");
        double earthDiameter = 1.091678E+2;
        System.out.println(earthDiameter);
        return (int)Math.pow(cube, cube);
        
    }
}