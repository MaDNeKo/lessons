import java.util.Random;

public class BinarySearch {

    static boolean binarySearch(int[] arr, int value) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) return true;
            if (arr[mid] < value) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 10, 15, 27};
        if (binarySearch(arr, 27)) System.out.print("Элемент найден");
        else System.out.println("Такого элемента в массиве нет");

        Random rand = new Random();
        int one = rand.nextInt(100);
        int two = rand.nextInt(100);
        int three = rand.nextInt(100);

        if(one >= two) {
            if(two >= three){
                System.out.print(three + " " + two + " " + one);
            }
            else System.out.print(two + " " + three + " " + one);
        }
        else if (two >= one) {
            if (one >= three) {
                System.out.print(three + " " + one + " " + two);
            }
            else System.out.print(one + " " + three + " " + two);
        }
        else if (three >= one) {
            if (one >= two) {
                System.out.print(two + " " + one + " " + three);
            }
            else System.out.print(one + " " + two + " " + three);
        }


    }
}
