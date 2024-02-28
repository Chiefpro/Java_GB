import java.util.Scanner;

public class JR {
    public static void main(String[] args) {
        zadacha24();
    }

    public static void zadacha24() {
        Scanner sc = new Scanner(System.in);
        int temp =0 ;
        boolean br = true;
        while (br) {
            System.out.print("Введи температуру => ");
            if (sc.hasNextInt()==true){
                temp = sc.nextInt();
                br = false;
            }
        
            
            
            
        }
        System.out.println(temp >=0 ? "тепло" : "холодно");

        

    }

}
