import java.util.Scanner;
import java.util.Random;

public class KStat_nk
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (rand.nextInt(100) + 1);
        }
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.print("\nВведите k: ");
        int k = in.nextInt();
        int[] mins = new int[k];
        for (int i = 0; i < mins.length; i++)
        {
            mins[i] = 101;
        }

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < mins.length; j++)
            {
                if (array[i] < mins[j])
                {
                    for (int l = mins.length - 1; l > j; l--)
                    {
                        mins[l] = mins[l - 1];
                    }
                    mins[j] = array[i];
                    break;
                }
            }
        }
        for (int i = 0; i < mins.length; i++) System.out.print(mins[i] + " ");
        System.out.print("\n" + mins[k - 1]);
    }
}
