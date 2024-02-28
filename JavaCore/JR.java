import java.util.Scanner;

public class JR {
    public static void main(String[] args) {
        zadacha24();
    }

    public static void zadacha24() {
        Scanner sc = new Scanner(System.in);
        int temp;
        while (true) {
            System.out.print("Введи температуру => ");
            boolean tt = sc.hasNextInt();
            if (!tt) {
                System.out.println("Ты ввел не число!!!");
            } else {
                temp = sc.nextInt();
                break;
            }
        }
        System.out.println(temp >= 0 ? "тепло" : "холодно");

        int d1, d2, d3;
        d1 = sc.nextInt();
        d2 = sc.nextInt();
        d3 = sc.nextInt();

        if (d2 == d3 && d2 == d1)
            System.out.println(d2 + " " + d3 + " " + d1);
        else if (d2 == d3)
            System.out.println(d2 + " " + d3);
        else if (d1 == d3)
            System.out.println(d1 + " " + d3);
        else if (d1 == d2)
            System.out.println(d1 + " " + d2);
        else
            System.out.println("нет таких");
    }

}
