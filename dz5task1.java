import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class dz5task1 {

    // sortedPrint() - сортирует и распечатывает данные по абонентам
    static void sortedPrint(Map<String, ArrayList<Integer>> map) {

        // Получаем набор всех ключей abon
        Set<String> keySet = map.keySet();

        // Находим минимальное и максимальное значение
        int maxCount = 0;
        int minCount = 1_000_000;

        for (var item : map.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();

        }
        // Формируем стек, начиная с минимального количества номеров
        Stack<String> st = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {
            // System.out.println(map);
            for (var item : map.entrySet()) {
                if (item.getValue().size() == num) {
                    st.push(item.getKey());
                }
            }
            num += 1;
        }

        // Распечатываем пары в порядке ключей, находящихся в стеке
        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = st.pop();
            for (var item : map.entrySet()) {
                if (name == item.getKey()) {
                    System.out.printf("%8s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Инициализация начального списка
        HashMap<String, ArrayList<Integer>> abon = new HashMap<>() {
            {
                put("Саша", new ArrayList<Integer>() {
                    {
                        add(123456789);
                        add(12345);
                        add(123);
                    }
                });
                put("Ваня", new ArrayList<Integer>() {
                    {
                        add(1111111);
                    }
                });
                put("Катя", new ArrayList<Integer>() {
                    {
                        add(2222222);
                        add(222);

                    }
                });
                put("Лена", new ArrayList<Integer>() {
                    {
                        add(12313123);
                        add(89090);
                        add(232323);
                        add(454545);
                    }
                });
            }
        };

        // Создаем циклическое меню
        Scanner scan = new Scanner(System.in, "cp866");
        while (true) {
        System.out.println("Введите номер действия: "
                + "\n 1 - добавить абонента; "
                + "\n 2 - Вывести всех; "
                + "\n 3 - выйти из программы.");
        System.out.println();
        String st = scan.nextLine();
        String name = "";
        String phone;

            if (st.equals("1")) {
                System.out.println("Введите Имя абонента:");
                name = scan.nextLine();
                System.out.println("Введите номера телефонов через запятую: ");
                phone = scan.nextLine();
                String[] arr = phone.split(",");
                ArrayList<Integer> arrInt = new ArrayList<>();
                for (String item : arr) {
                    arrInt.add(Integer.parseInt(item.trim()));
                }
                abon.put(name, arrInt);
                System.out.println();
            } else if (st.equals("2")) {
                sortedPrint(abon);
            } else if (st.equals("3")) {
                System.out.println();
                System.out.println("До свидания!");
                scan.close();
                break;
            }
        }
    }
}