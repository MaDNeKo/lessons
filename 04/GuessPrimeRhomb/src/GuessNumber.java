import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int i = rand.nextInt(100) + 1;
        System.out.print("Число было загадано. Ваш вариант: ");
        while (true) {
            int number = in.nextInt();
            if (number == i) {
                System.out.println("Вы угадали! Поздравляю!");
                break;
            }
            else if (number > i) System.out.println("Моё число меньше");
            else System.out.println("Моё число больше");
        }
    }
}