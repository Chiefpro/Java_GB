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

        String d1,d2;
        
        d2 = "DD";
        System.out.println("vvedi D1");
        d1 = sc.next();
        System.out.println("Vvedi D2");
        d2 = sc.next();
        System.out.println(d1);
        System.out.println(d2);
        
        System.out.println(d1.equalsIgnoreCase(d2)?"Одинаковые":"разные");

    }

}
