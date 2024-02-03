
public class HW_01_1 {
    public static void main(String[] args) {
        clearScreen();
        printThreeWords("Orange", "Banana", "Apple");
        System.out.println(checkSumSign(2, -3));
        System.out.println("-------------------------------");
        System.out.println(printColor(101));
        System.out.println("-------------------------------");
        System.out.println(compareNumbers(2, 3));

    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printThreeWords(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("-----------------------------------------");
    }

    public static String checkSumSign(int a, int b){
        return ((a+b >= 0)?"Сумма положительная":"Сумма отрицательная");
    }
    public static String printColor(int value){
        return value<=0?"Красный":value>100?"Зеленый":"Желтый";
    }
    public static String compareNumbers(int a, int b){
        return a>=b?"a >= b":"a < b";
    }
}