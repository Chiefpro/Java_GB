package JavaCore;

/**
 * HW_04
 */
public class HW_04 {

    public static void main(String[] args) {
        System.out.println( -100.0 / 0.0 );
        System.out.println(0.0 / 0.0);

        //gergeffffg456
        System.out.println(pow(2, 3));
    }

    public static double pow(int number, int power) {
        if (power == 0) {
            return 1;
        }

        int modulus = power < 0 ? power * -1 : power;
        int result = (int)Math.pow(number, modulus);
        return result;
        
    }
}
