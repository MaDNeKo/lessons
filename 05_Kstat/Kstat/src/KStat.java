import java.util.Scanner;
import java.util.Random;

public class KStat {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.print("Введите число: ");//так и не придумал, как это нормально обозвать
        int k = in.nextInt();
        if (k > size) {
            System.out.println("Число не может быть больше размера массива.");
            return;
        }
        System.out.println("K-я статистика - " + array[k-1] +
                "\nВ массиве");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
