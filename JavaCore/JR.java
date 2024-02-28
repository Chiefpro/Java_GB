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

        Scanner sc = new Scanner(System.in);
        // System.out.print("Введи первую строку (нижний) => ");
        // String z1 = sc.nextLine().toLowerCase();
        // System.out.print("Введи вторую строку (верхний) => ");
        // String z2 = sc.nextLine().toUpperCase();
        // System.out.print("Введи третью строку => ");
        // String z3 = sc.nextLine();
        // System.out.println(z1 + "\n" + z2 + "\n" + z3);

        // int z4 = (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3;
        int z5;
        if (sc.hasNextInt()){
            z5 = sc.nextInt();
        System.out.println("катит " + z5);
        }
        else
            System.out.println("не катит");
        // System.out.println(z4);
    }
}
