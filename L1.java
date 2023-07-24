import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        String s = "Hello New 2!!!!";
        System.out.println(s);

        var a = 123;
        System.out.println(a);
        var d = 123.4758;

        System.out.println(d);
        System.out.println(getType(a));
        System.out.println(getType(d));
        System.out.println(Integer.MAX_VALUE);
        boolean f = 123 != 321;
        System.out.println(f);

        Scanner iScanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = iScanner.nextLine();
        System.out.println("Hello, " +  name);
        int x = iScanner.nextInt();
        int y = iScanner.nextInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);
        iScanner.close();
        
        


    }

    static String getType(Object o) {   
        return o.getClass().getSimpleName();
    }

}
