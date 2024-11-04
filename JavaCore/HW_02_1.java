public class HW_02_1 {
    public static void main(String[] args) {
       clearScreen();
        tire();

    }
    public static void tire(){
        System.out.println("-----------------------");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    

    

}
