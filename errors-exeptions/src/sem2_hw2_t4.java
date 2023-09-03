//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.InputMismatchException;
import java.util.Scanner;

public class sem2_hw2_t4 {
    public static void main(String[] args) {
        String string = getOnlyString();
        System.out.println("Вы ввели символы: "+ string);
    }

    public static String getOnlyString(){
        Scanner scanner = new Scanner(System.in);
        String str = null;
        boolean flag = true;
        while (flag){
            try {
                System.out.println("Введите что угодно, но не пустую строку ");
                str = scanner.nextLine();
                if (str.equals("")) {
                    throw new InputMismatchException("Строка не может быть пустой!");
                }
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println(e);
            }

        }
        return str;
    }
}
