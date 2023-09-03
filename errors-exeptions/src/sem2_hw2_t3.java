public class sem2_hw2_t3 {
    public static void main(String[] args) throws IndexOutOfBoundsException /*только данное исключение ожидается от нашего метода при нормальной работе системы и условнии неизменности кода*/{
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }  /*catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } - данное исключение не может быть воспроизведено в предложенном коде (принимается во внимание, что код не изменяем)*/
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
//        catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");/*Необходимо поставить в 3-ю очередь, т.к. это базовый тип исключения и он будет "перехватывать" остальные
//            , также необходимо учесть, что это очень обширное исключение и в данном коде его использование под сомнением, лучше даже удалить*/

    }
    public static void printSum(Integer a, Integer b) /*throws FileNotFoundException - такое исключение невозможно в данном методе*/ {
        System.out.println(a + b);
    }

}
