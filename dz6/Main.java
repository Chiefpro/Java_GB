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
public class Main {
    public static void main(String[] args) {

        // СОЗДАЕМ МНОЖЕСТВО НОУТБУКОВ
        Set<Notebook> mySet = new HashSet<>();
        Notebook notebook0 = new Notebook("HP 255 G8", 15.6, 4, 1000, "Windows10", "silver", 22000);
        Notebook notebook1 = new Notebook("ASUS Laptop 15 F515MA-BQ731W", 15.6, 4, 500, "Windows11", "black", 25000);
        Notebook notebook2 = new Notebook("Lenovo IdeaPad 3 15ITL6", 15.6, 8, 256, "Windows11", "gray", 27000);
        Notebook notebook3 = new Notebook("HP 14S-DQ2075NIA (3B9Z5EA)", 14.5, 8, 256, "Windows11", "silver", 39999);
        Notebook notebook4 = new Notebook("Lenovo V130-15IGM", 15.6, 8, 1000, "Windows11", "black",19999);
        Notebook notebook5 = new Notebook("Apple MacBook Pro A2442", 14.5, 8, 512, "MacOS", "gray",186900);
        Notebook notebook6 = new Notebook("HUAWEI 53013PET MateBook",14.5, 16, 512,  "Windows10", "gray", 98999);
        Notebook notebook7 = new Notebook("HP 14S-DQ2075NIA (3B9Z5EA)", 14.5, 8, 256, "Windows10","black", 39999);
        Notebook notebook8 = new Notebook("HP ProBook 450 G8 61W28AV", 15.6, 8, 256, "Windows11", "silver", 44999);
        Notebook notebook9 = new Notebook("MSI Pulse GL76 12UDK-282XRU", 17.3, 8, 1000, "Windows11", "black", 98999);

        mySet.add(notebook0);
        mySet.add(notebook1);
        mySet.add(notebook2);
        mySet.add(notebook3);
        mySet.add(notebook4);
        mySet.add(notebook5);
        mySet.add(notebook6);
        mySet.add(notebook7);
        mySet.add(notebook8);
        mySet.add(notebook9);

        // ВЫЗЫВАЕМ МЕТОДЫ ДЛЯ ФОРМИРОВАНИЯ ЗАПРОСА ПОЛЬЗОВАТЕЛЯ И СРАВНЕНИЯ С БАЗОЙ ДАННЫХ
        Notebook.menu();
        Notebook.normDemands(mySet);
    }
}