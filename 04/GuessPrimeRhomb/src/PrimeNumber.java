import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        boolean isPrime = true;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime || number == 1) {
            System.out.println("Число не является простым");
        }
        else System.out.println("Число простое");
    }
}