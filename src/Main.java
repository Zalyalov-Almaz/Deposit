

public class Main {

    private static int deposit = 0;

    public static void getIncome(int contribution) {
        try {
            if (contribution >= 1000) {
                deposit = deposit + contribution;
                int income = deposit * 3 / 100;
                System.out.println("Доход по вкладу составляет " + income + " рублей");
            } else throw new InsufficientAmountOfDepositException();
        }
        catch (InsufficientAmountOfDepositException e) {
            System.out.println(e.message);
        }
    }
    public static void main(String[] args) {
        getIncome(3000);
    }
}
class InsufficientAmountOfDepositException extends Exception {
    String message = "Недостаточная сумма вклада";
}
