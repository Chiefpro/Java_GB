
public class HW_01_1 {
    public static void main(String[] args) {
        proba1();
        printThreeWords();
        System.out.println("----------------------------");
        checkSumSign();
        System.out.println("----------------------------");
        printColor(101);

    }

    public static void proba1() {

        System.out.println("Hello World!!!!");
        System.out.println(5 + 7);
        String str = "Proba pera";
        System.out.println(str);
        System.out.println("----------------------------");
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a, b;
        a = 5;
        b = -12;
        System.out.println((a + b) > 0 ? "Polozh" : "Otric");
    }

    public static void printColor(int value) {
        if (value <= 0)
            System.out.println("red");
        else if (value > 0 && value <= 100)
            System.out.println("Ellow");
        else
            System.out.println("Green");

        System.out.println("====");
    }

}