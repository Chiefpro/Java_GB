// package 6_Java.Java_GB.dz6.1;/

import java.util.*;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

 */
public class Notebook {
    // ОПРЕДЕЛЯЕМ ПОЛЯ КЛАССА NOTEBOOK
    String name;
    double diagonal;
    int maxRAM;
    int maxHDD;
    String opSystem;
    String color;
    int price;

    // КОНСТРУКТОР КЛАССА NOTEBOOK
    public Notebook(String name, double diagonal, int maxRAM, int maxHDD, String opSystem, String color, int price) {
        this.name = name;
        this.diagonal = diagonal;
        this.maxRAM = maxRAM;
        this.maxHDD = maxHDD;
        this.opSystem = opSystem;
        this.color = color;
        this.price = price;
    }

    // ОПРЕДЕЛЯЕМ ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    @Override
    public String toString() {
        return "\nНоутбук:             " + name +
                "\nДиаганаль, дюймов:   " + diagonal +
                "\nМакс. объем RAM, ГБ: " + maxRAM +
                "\nЖесткий диск, ГБ:    " + maxHDD +
                "\nТип ОС:              " + opSystem +
                "\nЦвет:                " + color +
                "\nЦена:                " + price;
    }


    public static void menu() {
        System.out.print("""Уважаемый пользователь, 
                для быстрого поиска ноутбука, укажите
                требования к его характеристикам:
                выбор диаганали        - нажмите 1
                выбор Макс. объем RAM  - нажмите 2
                выбор жесткого диска   - нажмите 3
                выбора типа ОС         - нажмите 4
                выбор цвета            - нажмите 5
                задать все пареметры   - нажмите 6
                Ваше решение: \s""";);
    }

    // ФОРМИРУЕМ МНОГОВАРИАНТНЫЕ ЗАПРОСЫ ПОЛЬЗОВАТЕЛЯ ДЛЯ ДОБАВЛЕНИЯ В ФИЛЬТР
    public static Set<Object> normDemands(Set<Notebook> mySet) {
        Scanner aScanner = new Scanner(System.in);
        int decisionNumber = aScanner.nextInt();
        String text1 = "
                В настоящее время доступны ноутбуки,
                имеющие следующие диаганали:
                - 14.5 дюймов;
                - 15.6 дюймов;
                - 17.3 дюйма.
                Введите нужное значение: \s";

        String text2 = "
                В настоящее время доступны ноутбуки,
                имеющие максимальный объем ОЗУ:
                - 4  ГБ;
                - 8  ГБ;
                - 16 ГБ.
                Введите нужное значение: \s";

        String text3 = "
                В настоящее время доступны ноутбуки,
                имеющие следующие объемы ЖД:
                - 1000 ГБ;
                - 512  ГБ;
                - 500  ГБ;
                - 256  ГБ.
                Введите нужное значение: \s";

        String text4 = "
                В настоящее время доступны ноутбуки,
                имеющие следующие операционные системы:
                - Windows10;
                - Windows11;
                - MacOS.
                Введите нужную ОС: \s";

        String text5 = "
                В настоящее время доступны ноутбуки,
                следующих цветов:
                - silver;
                - gray;
                - black.
                Введите нужный цвет: \s";

        double diagonal;
        int maxRAM;
        int maxHDD;
        String opSystem;
        String color;

        Set<Object> request = new HashSet<>();
        if (decisionNumber == 1) {                              // Блок фильтра по диаганали ноутбука.
            System.out.printf("\n%s", text1);
            Scanner bScanner = new Scanner(System.in);
            diagonal = Double.parseDouble(bScanner.next());
            request.add(diagonal);
            result(mySet, request);
            return request;

        }
        if (decisionNumber == 2) {                              // Блок фильтра по ОЗУ.
            System.out.printf("\n%s", text2);
            Scanner cScanner = new Scanner(System.in);
            maxRAM = cScanner.nextInt();
            request.add(maxRAM);
            result(mySet, request);
            return request;

        }
        if (decisionNumber == 3) {                              // Блок фильтра по жесткому диску.
            System.out.printf("\n%s", text3);
            Scanner dScanner = new Scanner(System.in);
            maxHDD = dScanner.nextInt();
            request.add(maxHDD);
            result(mySet, request);
            return request;
        }
        if (decisionNumber == 4) {                              // Блок фильтра по операционной системе.
            System.out.printf("\n%s", text4);
            Scanner eScanner = new Scanner(System.in);
            opSystem = eScanner.next();
            request.add(opSystem);
            result(mySet, request);
            return request;
        }
        if (decisionNumber == 5) {                               // Блок фильтра по цвету ноутбука.
            System.out.printf("\n%s", text5);
            Scanner fScanner = new Scanner(System.in);
            color = fScanner.next();
            request.add(color);
            result(mySet, request);
            return request;
        }
        if (decisionNumber == 6) {                               // Блок фильтра по всем параметрам.
            System.out.printf("\n%s", text1);
            Scanner bScanner = new Scanner(System.in);
            diagonal = Double.parseDouble(bScanner.next());
            request.add(diagonal);

            System.out.printf("\n%s", text2);
            Scanner cScanner = new Scanner(System.in);
            maxRAM = cScanner.nextInt();
            request.add(maxRAM);

            System.out.printf("\n%s", text3);
            Scanner dScanner = new Scanner(System.in);
            maxHDD = dScanner.nextInt();
            request.add(maxHDD);

            System.out.printf("\n%s", text4);
            Scanner eScanner = new Scanner(System.in);
            opSystem = eScanner.next();
            request.add(opSystem);

            System.out.printf("\n%s", text5);
            Scanner fScanner = new Scanner(System.in);
            color = fScanner.next();
            request.add(color);
            equals(mySet, request);
            return request;

        }
        return request;
    }

    // МЕТОД ДЛЯ ОТРАБОТКИ ЗАПРОСОВ ПО ОДНОМУ ПАРАМЕТРУ
    public static void result(Set<Notebook> mySet, Set<Object> request) {
        boolean flag = false;
        System.out.println("\nПо Вашему запросу найдены следующие товары: \n");
        for (Notebook notebook : mySet) {
            for (Object elem : request) {
                if (elem.equals(notebook.diagonal) || elem.equals(notebook.maxRAM) || elem.equals(notebook.maxHDD) ||
                        elem.equals(notebook.opSystem) || elem.equals(notebook.color)) {
                    flag = true;
                    System.out.println(notebook);
                }
                if (elem.equals(notebook.diagonal) && elem.equals(notebook.maxRAM) && elem.equals(notebook.maxHDD) &&
                        elem.equals(notebook.opSystem) && elem.equals(notebook.color)) {
                    flag = true;
                    System.out.println(notebook);
                }
            }
        }
        if (!flag) {
            System.out.println("\nК сожалению товаров с указанными характеристиками сейчас нет. " +
                    "Проконсультироваться о возможности заказа ноутбуков можно у менеджера (тел. +7-999-888-77-66)");
        }
    }

    // МЕТОД ДЛЯ ОТРАБОТКИ ЗАПРОСА ПО ВСЕМ ПАРАМЕТРАМ

    public static void equals(Set<Notebook> mySet, Set<Object> request) {
        boolean flag = false;
        for (Notebook notebook : mySet) {
            for (Object ignored : request) {
                if (request.contains(notebook.diagonal) && request.contains(notebook.maxRAM)
                        && request.contains(notebook.maxHDD) && request.contains(notebook.opSystem) && request.contains(notebook.color)) {
                    flag = true;
                    System.out.println(notebook);
                    break;
                }
            }

        }
        if (!flag) {
            System.out.println("\nК сожалению товаров с указанными характеристиками сейчас нет. " +
                    "Проконсультироваться о возможности заказа ноутбуков можно у менеджера (тел. +7-999-888-77-66)");
        }
    }
}