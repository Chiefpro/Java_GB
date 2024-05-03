package Exc.Exc3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел данные (ФИО, дата рождения, номер телефона, пол): ");
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        if (values.length != 6) {
            throw new Exception("Неверное количество значений");
        }
        String lastName = values[0];
        String firstName = values[1];
        String middleName = values[2];
        LocalDate birthDate = parseDate(values[3]);
        int phone = parsePhone(values[4]);
        char gender = values[5].charAt(0);
        if (gender != 'm' && gender != 'f') {
            throw new Exception("Неверное значение для поля 'пол'");
        }
        String fileName = lastName + ".txt";
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file, true);
        try {
            fileWriter.write(lastName + " " + firstName + " " + middleName + " " + birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " " + phone + " " + gender + System.lineSeparator());
            fileWriter.close();
            System.out.println("Данные успешно добавлены в файл " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static LocalDate parseDate(String date) throws Exception {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            throw new Exception("Неверный формат даты");
        }
    }

    private static int parsePhone(String phone) throws Exception {
        try {
            return Integer.parseInt(phone);
        } catch (NumberFormatException e) {
            throw new Exception("Неверный формат номера телефона: " + phone);
        }
    }
}