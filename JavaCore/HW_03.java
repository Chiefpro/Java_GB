package JavaCore;

import java.util.Arrays;
import java.util.Random;

/**
 * HW_03
 */
public class HW_03 {

    public static void main(String[] args) {
       zadanie1();
       zadanie2();
       zadanie3();
       zadanie4();
       System.out.println(Arrays.toString(zadanie5(5, 8)));
       System.out.println("--------------------------------------------");
       zadanie6();
       int[] z7 = { 2, 4, 2, 1, 2, 2, 10, 3 };
       System.out.println(zadanie7(z7));
       System.out.println("-------------------------------------------");
        int[] z8 = { 1, 2, 3, 4, 5 };
        zadanie8(z8, 2);
        System.out.println("-------------------------------------------");

    }

    public static void zadanie1() {
        int[] z1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString((z1)));
        for (int i = 0; i < z1.length; i++) {
            if (z1[i] == 0)
                z1[i] = 1;
            else
                z1[i] = 0;
        }
        System.out.println(Arrays.toString(z1));
        System.out.println("---------------------------------------------------");
    }

    public static void zadanie2() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------------------------------");
    }

    public static void zadanie3() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------------------------------");
    }

    public static void zadanie4() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------");
    }

    public static int[] zadanie5(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void zadanie6() {
        int[] array = new int[10];
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(50);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        System.out.printf("Минимальное занчение => %d, максимальное => %d \n", min, max);
        System.out.println("-----------------------------------------------------------");

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.printf("Минимальное занчение => %d, максимальное => %d \n", array[0], array[array.length - 1]);
        System.out.println("-----------------------------------------------------------");
    }

    public static boolean zadanie7(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int n = 0;
        int ni = 0;
        for (int j = 0; j < array.length; j++) {
            n += array[j];
            if (n == sum / 2) {
                ni = j;
                break;
            }
        }
       //System.out.println(ni);
        int nj = 0;
        for (int i = ni+1; i < array.length; i++) {
            nj += array[i];
        }
        // System.out.println(sum);
        // System.out.println(n);
        // System.out.println(nj);
        return n == nj;
    }

    public static void zadanie8(int[] array, int n){
        System.out.println(Arrays.toString(array));
        int temp = 0;
        
        if(n < 0){
            n = n * (-1);
            for (int j = 0; j < n; j++) {
                
                for (int i = 0; i < array.length-1; i++) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
                //System.out.println(Arrays.toString(array));
            }
            return;
        }

        if(n > 0){
            
            for (int j = 0; j < n; j++) {
                
                for (int i = array.length-1; i > 0; i--) {
                    temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
                // System.out.println(Arrays.toString(array));
            }
        }

        System.out.println(Arrays.toString(array));
    }

}