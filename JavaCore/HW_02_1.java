public class HW_02_1 {
    public static void main(String[] args) {
       clearScreen();
        tire();
        System.out.println(z1(12, 9));
        tire();
        System.out.println(z2(-2));
        tire();
        System.out.println(z3(3));
        tire();
        z4("Дичччччччч", 5);
        tire();
        System.out.println(z5(2000));



    }
    public static void tire(){
        System.out.println("-----------------------");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static boolean z1(int a, int b){
        boolean otvet = false;
        if (a+b >= 10 && a+b <= 20) {
            otvet = true;
        }
        return otvet;
    }

    public static String z2(int a){
        return a >= 0 ? "Положительное" : "Отрицательное" ;
    }

    public static boolean z3(int a){
        return a >= 0 ? true : false;
    }

    public static void z4(String st, int a){
        for (int i = 0; i < a; i++){
            System.out.println((i+1) + " " + st);
        }
    }

    public static boolean z5(int a){
        return (a % 4 == 0 && a % 100 != 0) || a % 400 == 0 ? true : false;
    }


}
