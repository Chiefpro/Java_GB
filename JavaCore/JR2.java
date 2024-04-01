import java.util.Arrays;
import java.util.Scanner;

public class JR2 {
    public static void main(String[] args) {
        
        int[] array = getArrayOfTenElements();
        System.out.println(Arrays.toString(array));
        System.out.printf("Минимальный элемент => %d", min(array));
    }



    public static int[] getArrayOfTenElements(){
        System.out.print("Введи длину масива => ");
        Scanner sc = new Scanner(System.in);
        int longArrya = sc.nextInt();
        int[] array = new int[longArrya];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введи %d элемент => ", i+1);
            array[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(array));
        return array;
    }

    public static int min(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

}
