package Exc2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(CheckFloat());
    }

    public static float CheckFloat() {
        float num;
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);

        try {
            num = input.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Введено не число");
            return CheckFloat();
        } finally {
            input.close();
        }

        return num;
    }
}
