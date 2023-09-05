package JavaCore;

import java.util.Random;

/**
 * HW_04
 */
public class HW_04 {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static void main(String[] args) {
        System.out.println( -100.0 / 0.0 );
        System.out.println(0.0 / 0.0);

        //gergeffffg456
        System.out.println(pow(2, 3));

        System.out.println("Заработаю ли я себе на BMW?");
        System.out.println(getPrediction());
    }

    public static double pow(int number, int power) {
        if (power == 0) {
            return 1;
        }

        int modulus = power < 0 ? power * -1 : power;
        int result = (int)Math.pow(number, modulus);
        return result;
    }

    public static String getPrediction() {
        //напишите тут ваш код
        String resalt = null;
        Random rn = new Random();
        int t = rn.nextInt(8);
        System.out.println(t);
        switch (t) {
            case 0:
                resalt = CERTAIN;
                break;
            case 1:
                resalt = DEFINITELY;
                break;
            case 2:
                resalt = MOST_LIKELY;
                break;
            case 3:
                resalt = OUTLOOK_GOOD;
                break;
            case 4:
                resalt = ASK_AGAIN_LATER;
                break;
            case 5:
                resalt = TRY_AGAIN;
                break;
            case 6:
                resalt = NO;
                break;
            case 7:
                resalt = VERY_DOUBTFUL;
                break;    
        
            default:
                break;
        }
        return resalt;

        
    }


    

}
