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

        // Может, я не так поняла задание, но здесь константы, поэтому исключений по делению никогда не возникнет.

        int a = 90;
        int b = 3;

        System.out.println(a / b);
        printSum(null, null);

        try {
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Индекс массива выходит за пределы допустимого диапазона!");
        }
    }

    public static void printSum(int int1, int int2) {
        System.out.println("Sum = " + (int1 + int2));
    }
    // Или иначе
    /* public static void printSum(Integer int1, Integer int2) {
       if (int1 != null && int2 != null) {
            System.out.println("Sum = " + (int1 + int2));
       } else {
            System.out.println("Такое не складываем");
       }
    }*/
}
