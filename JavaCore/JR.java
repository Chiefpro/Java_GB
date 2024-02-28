import java.util.Scanner;

public class JR {
    public static void main(String[] args) {
        zadacha24();
    }

    public static void zadacha24() {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        do {
            System.out.print("Введи температуру => ");
            temp = sc.nextInt();
            
        }while (sc.hasNextInt());
        System.out.println(temp >= 0 ? "тепло" : "холодно");

        

    }

}
