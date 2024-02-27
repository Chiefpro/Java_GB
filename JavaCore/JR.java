import java.util.Scanner;

public class JR {
    public static void main(String[] args) {
        zadacha24();
    }

    public static void zadacha24() {
        int number = 546;

        int lastDigit; // напишите тут ваш код
        lastDigit = number % 10;

        System.out.println(lastDigit);

        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount);

        System.out.println(hugeAmount);

        System.out.print("Введи число => ");
        Scanner sc = new Scanner(System.in);
        int za45 = sc.nextInt();
        System.out.println("Ты ввел => " + za45);
    }
}
