

public class HW_01 {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        checkSumSign(2, -12);
        System.out.println();
        printColor(1);
        System.out.println();
        compareNumbers(4, 2);
    }

    public static void printThreeWords() {
        System.out.println("baban");
        System.out.println("orange");
        System.out.println("apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0)
            System.out.println("Polozhitelno");
        else
            System.out.println("Otricatelno");
    }

    public static void printColor(int value) {
        if (value <= 0)
            System.out.println("Red");
        else if (value > 0 && value < 100)
            System.out.println("Elow");
        else
            System.out.println("Green");

    }

    public static void compareNumbers(int a, int b){
        if (a>=b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

}
