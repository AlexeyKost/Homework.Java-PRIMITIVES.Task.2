public class Main {
    public static void main(String[] args) {

        int schet = 200; // сумма на счете

        int oplata = 300; // пополнение счета

        int bonus = oplata / 100; //расчет бонуса
        int summa;


        if (oplata > 1000) {
            summa = schet + bonus + oplata;
        } else {
            summa = schet + oplata;
        }

        System.out.println(summa);

    }
}