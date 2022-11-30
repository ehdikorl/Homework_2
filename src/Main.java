public class Main {
    public static void main(String[] args) {
        int ns = 100;
        int sp = 1501;
        int is;

        if(sp < 1000) {
            is = ns + sp;
            System.out.println("Бонусов нет. Итоговый счет " + is);
        } else {
            is = ns + sp + sp/100;
            System.out.println("Итоговый счет " + is + ". Зачислено бонусов " + sp/100);
        }

    }
}