public class Main {
    public static void main(String[] args) {

        int check = 200; // сумма на счете

        int payment = 3000; // пополнение счета

        int bonus = payment / 100; //расчет бонуса
        int summa;


        if (payment > 1000) {
            summa = check + bonus + payment;
        } else {
            summa = check + payment;
        }

        System.out.println(summa);

    }
}