public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int deposit = 1501;
        int total;

        if (deposit < 1000) {
            total = amount + deposit;
            System.out.println("Бонусов нет. Итоговый счет " + total);
        } else {
            total = amount + deposit + deposit / 100;
            System.out.println("Итоговый счет " + total + ". Зачислено бонусов " + deposit / 100);
        }

    }
}
