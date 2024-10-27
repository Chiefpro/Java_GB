
public class HW_01_1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("----------------------");
        printThreeWords("Orange", "Banana", "Apple");
        System.out.println("----------------------");
        System.out.println(checkSumSign(3, -4));
        System.out.println("----------------------");
        System.out.println(printColor(101));
        System.out.println("----------------------");
        System.out.println(compareNumbers(2, 2));
        System.out.println("----------------------");

    }

    public static void printThreeWords(String a1, String a2, String a3) {
        System.out.println(a1 + "\n" + a2 + "\n" + a3);
    }

    public static String checkSumSign(int a, int b) {
        String rez;
        if (a + b >= 0) {
            rez = "Сумма положительная";
        } else {
            rez = "Сумма отрицательная";
        }
        return rez;
    }

    public static String printColor(int value ){
        String rez;
        if (value <= 0) {
            rez = "Красный";
        } else if (value < 100) {
            rez = "Желтый";
        }
        else
        {
            rez = "Зеленый";
        }
        return rez;
    }

    public static String compareNumbers(int a, int b){
        return  a >= b ? "a >= b" : "a < b";
    }
}