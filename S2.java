import java.io.FileWriter;
import java.io.IOException;

public class S2 {

// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
    public static void main(String[] args) {
        System.out.println("--------------------  Задача 1 -----------------");
        String newStr = metod(8, 'f', 'g');
        System.out.println(newStr);

        System.out.println("--------------------  Задача 2 -----------------");
        String str1 = "aaaabbbcd";
        System.out.println(str1);
        String str2 = shatie(str1);
        System.out.println(str2);

        System.out.println("--------------------  Задача 3 -----------------");
        String str3 = "abccfba";
        boolean flag = palindrom(str3);
        System.out.println(flag);

        task4();
    
    
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

// Напишите метод, который сжимает строку. Пример: вход aaaabbbcddaa.
// a4b3cd2a2


        public static String shatie(String str) {
            StringBuilder sb = new StringBuilder();
            Character temp = null;
            Character last = null;
            int countTemp = 1;
            // aabbcdaa
            for (int i = 1; i < str.length(); i++) {
                temp = str.charAt(i); // d
                last = str.charAt(i - 1); //c 
                if (temp == last) {
                    countTemp++;
                } else {
                    if (countTemp == 1) {
                        sb.append(last);
                    } else {
                        sb.append(last).append(countTemp);
                        countTemp = 1;
                    }
                }
            }
            if (countTemp == 1) {
                sb.append(temp);
            } else {
                sb.append(temp).append(countTemp);
            }
            return sb.toString();
        }



// Напишите метод, который принимает на вход строку (String) и определяет 
// является ли строка палиндромом (возвращает boolean значение).
// abcba

        public static Boolean palindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            // a    b   a
            // 0    1   2
            // 
            // str.charAt(i) = 0
            // str.charAt(str.length() - i - 1) = 2
            //                  3      - 0 - 1  = 2
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //------------------------------------------------------------------444444-------------------------
    public static void task4(){
        int n = 10;
        String text = "TEST";
        try{
            FileWriter writer = new FileWriter("file.txt",true);
            System.out.println("Получилось");
            for (int i = 0; i < n; i++) {
                writer.write(text);
            }
            writer.close();
        }
        catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }

    
}