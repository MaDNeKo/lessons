import java.util.Scanner;
import java.util.Random;

public class Kstat_nk_constMem
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
        boolean isFirst = true;
        int lastMin = -1, min = -1;
        for (int i = 0; i < k; i++)
        {
            int j = 0;
            if (isFirst) min = array[0];
            else
            {
                for (; j < array.length; j++)
                {
                    if (array[j] > lastMin)
                    {
                        min = array[j];
                        break;
                    }
                }
            }
            for (; j < array.length; j++)
            {
                if (isFirst)
                {
                    if(array[j] < min)
                    { min = array[j]; }
                }
                else if (array[j] > lastMin && array[j] < min )
                {  min = array[j]; }
            }
            lastMin = min;
            isFirst = false;
        }
        System.out.println("K min = " + min);
    }
}
