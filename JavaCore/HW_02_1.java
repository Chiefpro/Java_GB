public class HW_02_1 {
    public static void main(String[] args) {
        clearScreen();
        System.out.println(zadanie1(5, 4));
        System.out.println("-------------------------");
        zadanie2(6);
        System.out.println(zadanie3(0));
        System.out.println("--------------------");
        zadanie4("Hello", 5);
        System.out.println("------------------------");
        zadanie5(2004);

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static boolean zadanie1(int a, int b) {
        return (a + b >= 10 && a + b <= 20) ? true : false;
    }

    public static void zadanie2(int value) {
        if (value >= 0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
        System.out.println("-------------------------------");
    }

    public static boolean zadanie3(int value) {
        return value >= 0 ? true : false;
    }

    public static void zadanie4(String st, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(st);
        }
    }

    public static void zadanie5(int year) {
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "Високосный" : "Не високосный");
    }

}
