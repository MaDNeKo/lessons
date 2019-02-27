public class BankAccount {

    private double balance;
    private int number;
    private String name;
    private static  int lastNum = 1;

    public BankAccount (String name) {
        this.name = name;
        this.number = lastNum++;
        this.balance = 0.0;
    }

    public double getBalance() { return balance; }
    public int getNumber() { return number; }
    public String getNameOfAcc() { return name; }

    public String toString() {
        String accInfo = "Аккаунт:\n" + " ФИО: " + name +
                "\n Номер счёта: " + number + "\n Баланс: " + balance;
        return accInfo;
    }

    public void refill(double sum) {
        if(sum <= 0.0) System.out.println("Ошибка. Некорректная сумма.");
        else {
            balance += sum;
            System.out.println("Пополнение на " + sum + " успешно.");
        }
    }

    public void withdraw(double sum) {
        if (sum > balance || sum <= 0.0) {
            System.out.println("Некорректная сумма или недостаточно денег.");
        }
        else {
            balance -= sum;
            System.out.println("Снятие наличных в сумме " + sum + " успешно");
        }
    }

    public void accountTransfer(BankAccount recipient, double sum) {
        if (this == recipient) {
            System.out.println("Error");
            return;
        }
        if (sum <= 0.0 || sum > this.balance) {
            System.out.println("Некорректная сумма или недостаточно денег");
        }
        else {
            this.balance -= sum;
            recipient.balance += sum;
            System.out.println("Перевод произведён корректно");
        }
    }
}
