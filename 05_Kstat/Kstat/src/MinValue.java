import java.util.Scanner;
import java.util.Random;

public class MinValue {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int number = in.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
        //int min = 2147483647;
        int min = array[0];
        int index = 1;
        System.out.println("В массиве:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] < min) {
                min = array[i];
                index = i + 1;
            }
        }
        System.out.println("\nМинимальное значение " + min +
                ", находящееся на " + index +  " месте в массиве");
    }
}