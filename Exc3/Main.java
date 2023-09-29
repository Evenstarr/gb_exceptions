package Exc3;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            UsersData usersdata = getUsers();
            writeUserData(usersdata);
        } catch (OwnException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static UsersData getUsers() throws OwnException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите данные о пользователе через пробел: ");
        String[] parts = sc.nextLine().split(" +");

        if (parts.length != 6) {
            throw new OwnException("Нужно ввести 6 элементов, а вы ввели " + parts.length);
        }

        String name = null;
        String surname = null;
        String patronymic = null;
        Date birthdate = null;
        Integer phone = null;
        String gender = null;

        String excMessage = "";

        if (parts[0].matches("^[А-Яа-яA-Za-z]+$")) {
            surname = parts[0];
        } else {
            excMessage += " Фамилия должна быть написана буквами, ";
        }

        if (parts[1].matches("^[А-Яа-яA-Za-z]+$")) {
            name = parts[1];
        } else {
            excMessage += " Имя должно быть написана буквами, ";
        }

        if (parts[2].matches("^[А-Яа-яA-Za-z]+$")) {
            patronymic = parts[2];
        } else {
            excMessage += " Отчество должна быть написана буквами, ";
        }

        try {
            birthdate = new SimpleDateFormat("dd.MM.yyyy").parse(parts[3]);
        } catch (ParseException e) {
            excMessage += " Неправильная дата рождения, ";
        }

        if (parts[4].matches("^[0-9]+$")) {
            phone = Integer.parseInt(parts[4]);
        } else {
            excMessage += " Неверный формат телефона, ";
        }

        if (!(parts[5].equals("m") || parts[5].equals("f"))) {
            excMessage += " Неверный пол";
        }

        if (!excMessage.equals("")) {
            throw new OwnException(excMessage);
        }

        return new UsersData(name, surname, patronymic, birthdate, phone, gender);
    }

    public static void writeUserData(UsersData usersData) throws IOException {
        try (FileWriter writer = new FileWriter(usersData.getSurname(), true)) {
            writer.write(usersData.toFileString());
        }
    }
}
