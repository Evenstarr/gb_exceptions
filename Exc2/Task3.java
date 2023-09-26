package Exc2;

public class Task3 {
    public static void main(String[] args) {
        //Если необходимо, исправьте данный код
        //
        //        try {
        //            int a = 90;
        //            int b = 3;
        //
        //            printSum(23, 234);
        //            int[] abc = { 1, 2 };
        //            abc[2] = 9;
        //        } catch (ArithmeticException ex) {
        //            System.out.println("Деление на ноль!");
        //        } catch (NullPointerException ex) {
        //            System.out.println("Указатель не может указывать на null!");
        //        } catch (ArrayIndexOutOfBoundsException ex) {
        //            System.out.println("Индекс массива выходит за пределы допустимого диапазона!");
        //        } catch (Exception ex) {
        //            System.out.println("Что-то пошло не так...");
        //        }

        // Вероятно, я тоже не поняла задание, но тут же тоже константные значения, которые никогда не вызовут исключения.
        // Единственная ошибка, которая подсвечивается при компиляции - необъявленная функция.

        int a = 90;
        int b = 3;

        System.out.println(a / b);

        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[1] = 9;
    }

    private static void printSum(int i, int i1) {
        System.out.println("Sum = " + (i + i1));
    }
}
