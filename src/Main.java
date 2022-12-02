public class Main {
    public static void main(String[] args) {
        int nachalnaya_summa = 100;
        int summa_popolneniya = 1501;
        int itogovaya_summa;

        if (summa_popolneniya < 1000) {
            itogovaya_summa = nachalnaya_summa + summa_popolneniya;
            System.out.println("Бонусов нет. Итоговый счет " + itogovaya_summa);
        } else {
            itogovaya_summa = nachalnaya_summa + summa_popolneniya + summa_popolneniya / 100;
            System.out.println("Итоговый счет " + itogovaya_summa + ". Зачислено бонусов " + summa_popolneniya / 100);
        }

    }
}
