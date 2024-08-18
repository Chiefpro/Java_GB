
public class HW_01_1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("hey");
        System.out.println("--------------------1-------------------");
        printThreeWords();
        System.out.println("--------------------2-------------------");
        System.out.println(checkSumSign(1, -21));
        System.out.println("--------------------3.0-----------------");
        System.out.println(printColor(200));
        System.out.println("--------------------3.1-----------------");
        System.out.println(printColor2(300));
        System.out.println("--------------------4-------------------");
        System.out.println(compareNumbers(300,2000));


    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
        // System.out.println("Banana");
        // System.out.println("Apple");
    }

    public static String checkSumSign(int a, int b) {
        return a + b >= 0 ? "Положительное" : "Отрицательное";
    }

    public static String printColor(int value) {
        if (value <= 0) {
            return "Красный";
        } else if (value > 0 && value < 100) {
            return "Желтый";
        } else {
            return "Зеленый";
        }
    }

    public static String printColor2(int value){
        return value <= 0 ? "Красный" : value > 0 && value < 100 ? "Желтый" : "Зеленый";
    }

    public static String compareNumbers(int a, int b){
        return a >= b ? "a >= b" : "a < b";
    }
}