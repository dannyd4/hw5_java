import java.util.InputMismatchException;
import java.util.Scanner;

public class sem2_hw2_t1 {
    public static void main(String[] args) {
        float number = getOnlyFloatNumber();
        System.out.println("Введённое число = "+ number);
    }

    public static float getOnlyFloatNumber(){
        Scanner scanner = new Scanner(System.in);
        float num = 0f;
        boolean flag = true;
        while (flag){
            try {
                System.out.println("Введите дробное число через (,): ");
                num = scanner.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                    System.out.println("Введено не дробное число, или использован неверный разделитель!\n");
                    scanner.next();
            }

        }
        return num;
    }
}
