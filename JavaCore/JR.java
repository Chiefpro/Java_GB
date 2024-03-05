import java.io.InputStreamReader;
import java.time.chrono.IsoEra;
import java.util.Arrays;
import java.util.Scanner;

import org.xml.sax.InputSource;

public class JR {
    public static void main(String[] args) {
        // zadacha24();
        // zadacha41(10);
        // zadacha42(10, 20);
        // zadacha43();
        zadacha44();
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
       int[] array = {1,3,4,5,-3,5,-67,4};
       System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i%2==0) {
                array[i] *= -1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
