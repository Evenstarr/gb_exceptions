package Exc2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = input.nextLine();
        if (str.isEmpty()) {
            throw new Exception("Нельзя вводить пустую строку");
        }
    }
}
