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
        System.out.print("Vvedi cho nibud = > ");
        String voit = sc.nextLine();
        while (count > 0) {
            System.out.println(voit + " " + count);
            count--;           
        }
    }

}
