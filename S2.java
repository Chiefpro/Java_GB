
public class S2 {

// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
    public static void main(String[] args) {
        System.out.println("--------------------  Задача 1 -----------------");
        String newStr = metod(8, 'f', 'g');
        System.out.println(newStr);

        System.out.println("--------------------  Задача 2 -----------------");
    }

    // public static String metod(int n, char c1, char c2) {
    // StringBuilder sb = new StringBuilder();

    // for (int i = 0; i < n; i++) {
    // if (i % 2 == 0) {
    // sb.append(c1);
    // } else {
    // sb.append(c2);
    // }
    // }
    // return sb.toString();
    // }
//  public static тип    название
    public static String metod(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
            // sb.append(c1);
            // sb..append(c2);
            // fg
            // fgfg
            // fgfgfg
        }
        return sb.toString();
    }
}
