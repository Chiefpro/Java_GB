import java.util.Scanner;

public class JR {
    public static void main(String[] args) {
        // zadacha24();
        zadacha41(10);
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

    public static void zadacha41(int count){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String dd = "";
        while (true) {
            System.out.print("Vvedi chislo ili END => ");
            if (sc.hasNextInt())
                sum += sc.nextInt();
            else
                dd = sc.nextLine();
            if (dd.equalsIgnoreCase("end")) {
            break;    
            }
        }
        System.out.println(sum);
    }

}
