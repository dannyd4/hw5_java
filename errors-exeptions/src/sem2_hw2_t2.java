//Задание 2
//        try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }


public class sem2_hw2_t2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int intArray = 8;/*введена переменная для исправления ошибки "cannot find symbol"*/
            double catchedRes1 = intArray / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());/*добавлен метод getMessage для оптимизации вывода*/
        }
    }


}
