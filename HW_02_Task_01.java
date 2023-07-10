import java.util.Scanner;

public class HW_02_Task_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean user = true;

        while (user==true){
            System.out.print("Введите дробное число: ");
            String num = sc.nextLine();
            try {
                float floatNum = Float.parseFloat(num);
                user = false;
                System.out.println("Ваше число: " + floatNum);
            } catch (NumberFormatException e) {
                System.out.println("Введённое число не дробное! \n Повторите ввод:");
            }
        }
    }    
}