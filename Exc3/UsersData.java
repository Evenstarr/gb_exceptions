package Exc3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsersData {
    private final String name;
    private final String surname;
    private final String patronymic;
    private final Date birthdate;
    private final int phone;
    private final String gender;


    public UsersData(String name, String surname, String patronymic, Date birthdate, int phone, String gender) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.phone = phone;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public int getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String toFileString() {
        String birthdateFormatted = new SimpleDateFormat("dd.MM.yyyy").format(birthdate);

        return surname + " " + name + " " + patronymic + ", " + birthdateFormatted + ", " +
                phone + ", " + gender + '\n';
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthdate=" + birthdate +
                ", phone=" + phone +
                ", gender=" + gender +
                '}';
    }
}
