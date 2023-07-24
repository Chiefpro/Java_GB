import java.util.Arrays;
import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {

        // Hello();
        ValMax();
        z3();

    }

    /*
     * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
     * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
     */

    public static void Hello() {
        Scanner iScanner = new Scanner(System.in, "cp866");
        // System.out.print("Введите имя => %s", name);
        System.out.print("Введите имя => ");
        String name = iScanner.nextLine();
        System.out.printf("Привет %s !!! \n", name);
        // System.out.println("Привет %s!!!" + name);
        iScanner.close();
        System.out.println("----------------------");
    }

    /*
     * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
     * количество подряд идущих 1..
     */

    public static void ValMax() {
        int[] array = new int[] { 1, 1, 1, 1, 0, 1, 1 };
        int valueMax = 0;
        int i = 0;
        for (int value : array) {
            if (value == 1) {
                i++;
                if (i > valueMax)
                    valueMax = i;
            } else {
                i = 0;
            }
        }
        System.out.println("Максималье значение => " + valueMax);
        System.out.println("----------------------");
    }

    /*
     * Дан массив nums = [3,2,4,3, 1, 3, 3, 5] и число val = 3.
     * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
     * конец массива.
     * Таким образом, первые несколько (или все) элементов массива должны быть
     * отличны от заданного, а остальные - равны ему.
     * [3,2,4,3,1,3,3,5]
     * [2,4,1,5,3,3,3,3]
     */
    public static void z3() {
        int[] nums = new int[] { 3, 2, 4, 3, 1, 3, 3, 5 };
        int val = 3;

        System.out.println(Arrays.toString(nums));

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = val;
        }

        System.out.println(Arrays.toString(nums));

    }

}