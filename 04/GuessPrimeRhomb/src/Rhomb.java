import java.util.Scanner;

public class Rhomb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int center = number / 2;
        for (int i = 0; i < number; i++){
            for (int j = 0; j < number; j++){
                if (i <= center){
                    if (j >= center - i && j <= center + i) System.out.print("*");
                    else System.out.print(" ");
                }
                else if(j >= center + i - number + 1 && j <= center - i + number - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}