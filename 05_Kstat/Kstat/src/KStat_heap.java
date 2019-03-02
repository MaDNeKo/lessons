import java.util.Random;
import java.util.Scanner;

public class KStat_heap
{
        private static void printArray(int[] a, String header)
        {
            System.out.println(header);
            for (int i = 0; i < a.length; i++)
            {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        private static void randFill(int[] a, int step)
        {
            Random rand = new Random();
            a[0] = rand.nextInt(step);
            for (int i = 1; i < a.length; i++)
            {
                a[i] = a[i - 1] + rand.nextInt(step) + 1;
            }
        }

        //Fisher–Yates shuffle
        private static void shuffle(int[] a)
        {
            Random rand = new Random();
            for (int i = 0; i < a.length; i++)
            {
                int index = rand.nextInt(a.length);
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        printArray(array, "Empty:");
        randFill(array, 10);
        printArray(array, "Filled:");
        shuffle(array);
        printArray(array, "Shuffled:");

        System.out.print("\nВведите k: ");
        int k = in.nextInt();
        Heap heap = new Heap();

//        int[] array = {63, 94, 6, 82, 101, 13, 76,
//            113, 120, 74, 30, 70, 38, 109, 53,
//            87, 11, 47, 98, 20};
        for (Integer num: array)
        { heap.add(num); }
        int max = -1;
        for (int i = 0; i < k; i++)
        { max = heap.extractMax(); }
        System.out.println("K max = " + max);
    }
}
