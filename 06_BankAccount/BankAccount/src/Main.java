import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<BankAccount> accList = new ArrayList<>();
        BankAccount one = new BankAccount("One");
        accList.add(one);
        System.out.println(accList.get(accList.size()-1).toString());
        int menu = 0;
        while (menu != 6) {
            System.out.print("\n1 - Создание аккаунта\n" +
                    "2 - Пополнение\n" + "3 - Снятие\n" +
                    "4 - Перевод со счёта на счёт\n" + "5 - Просмотр информации по счёту\n" +
                    "6 - Выход\nКоманда: ");
            menu = in.nextInt();
            in.nextLine();
            switch (menu)
            {
                case 1:
                {
                    System.out.print("Введите ФИО: ");
                    String name = in.nextLine();
                    accList.add(new BankAccount(name));
                    System.out.println(name + " успешно добавлен.");
                    System.out.println(accList.get(accList.size() - 1).toString());
                    break;
                }
                case 2:
                {
                    System.out.print("Введите номер счёта: ");
                    int number = in.nextInt();
                    while (number < 0 || number > accList.size())
                    {
                        System.out.print("Ошибка. Повторите ввод или введите 0 для отмены: ");
                        number = in.nextInt();
                    }
                    if (number != 0)
                    {
                        System.out.print("Введите сумму: ");
                        double sum = in.nextDouble();
                        accList.get(number - 1).refill(sum);
                    } else System.out.println("Пополнение отменено.");
                    break;
                }
                case 3:
                {
                    System.out.print("Введите номер счёта: ");
                    int number = in.nextInt();
                    while (number < 0 || number > accList.size())
                    {
                        System.out.print("Ошибка. Повторите ввод или введите 0 для отмены: ");
                        number = in.nextInt();
                    }
                    if (number != 0)
                    {
                        System.out.print("Введите сумму: ");
                        double sum = in.nextDouble();
                        accList.get(number - 1).withdraw(sum);
                    } else System.out.println("Снятие отменено.");
                    break;
                }
                case 4:
                {
                    System.out.print("Введите номер счёта донора: ");
                    int donor = in.nextInt();
                    while (donor < 0 || donor > accList.size())
                    {
                        System.out.print("Ошибка. Повторите ввод или введите 0 для отмены: ");
                        donor = in.nextInt();
                    }
                    if (donor == 0)
                    {
                        System.out.println("Перевод отменён.");
                        break;
                    }
                    System.out.print("Введите номер счёта получателя: ");
                    int recipient = in.nextInt();
                    while (recipient < 0 || recipient > accList.size())
                    {
                        System.out.print("Ошибка. Повторите ввод или введите 0 для отмены: ");
                        recipient = in.nextInt();
                    }
                    if (recipient == 0)
                    {
                        System.out.println("Перевод отменён.");
                        break;
                    }
                    System.out.print("Введите сумму: ");
                    double sum = in.nextDouble();
                    accList.get(donor - 1).accountTransfer(accList.get(recipient - 1), sum);
                    break;
                }
                case 5:
                {
                    System.out.print("Введите номер счёта: ");
                    int number = in.nextInt();
                    while (number < 0 || number > accList.size())
                    {
                        System.out.print("Ошибка. Повторите ввод или введите 0 для отмены: ");
                        number = in.nextInt();
                    }
                    if (number != 0)
                    {
                        System.out.println(accList.get(number - 1).toString());
                    } else System.out.println("Просмотр отменён.");
                    break;
                }
                case 6: break;
                default:
                    System.out.println("Ошибка. Повторите ввод или введите 6 для выхода.");
                    break;
            }
        }
    }
}
