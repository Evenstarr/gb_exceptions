package Exc2;

public class Task2 {
    public static void main(String[] args) {
        //Если необходимо, исправьте данный код
        //        try {
        //            int d = 0;
        //            double catchedRes1 = intArray[8] / d;
        //            System.out.println("catchedRes1 = " + catchedRes1);
        //        } catch (ArithmeticException e) {
        //            System.out.println("Catching exception: " + e);
        //
        //        }

        // Это задание специально сделано, чтобы исключения не использовались?
        // Все получаются Checked.

        int d = 0;
        double[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        if (d == 0) {
            System.out.println("Мы не делим на ноль");
        } else if (intArray.length < 9) {
            System.out.println("Неподходящая длина массива");
        } else {
            double catchedRes1 = intArray[9] / d;
            System.out.println(catchedRes1);
        }
    }
}
