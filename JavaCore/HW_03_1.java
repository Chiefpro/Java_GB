import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class HW_03_1 {
    public static void main(String[] args) {
        clearScreen();
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4(8);
        System.out.println(Arrays.toString(zadanie5(10, 5)));
        System.out.println("------------------------------");
        zadanie6(10);
        System.out.println("---------------------------------");
        int[] arrZad7 = { 2, 2, 2, 1, 2, 2, 10, 1 };
        System.out.println(zadanie7(arrZad7));
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void zadanie1() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------------");

    }

    public static void zadanie2() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------------");
    }

    public static void zadanie3() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------------------");
    }

    public static void zadanie4(int a) {
        int[][] arr = new int[a][a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        int g = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[g++][i] = 1;
        }

        printArrayDouble(arr);

    }

    public static void printArrayDouble(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] zadanie5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void zadanie6(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.printf("Минимальное число =>> %d, Максимальное число =>> %d \n", min, max);

    }

    public static boolean zadanie7(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
        int a = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
            if (a == sum / 2) {
                c = i;
                
            }

        }

        return true;
    }

}
