package com.week_1;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 */

public class task_2_3 {
    public static void main(String[] args) {
        int pay = 600;
        int pay_rise = 400;
        int spend = 300;
        int percent_per_month = 2;
        int percent_to_broker = 10;
        int months = 2;
        System.out.println("На своем счету Ваня будет иметь :" + ivanInvoiceCounter(pay, pay_rise, spend, percent_to_broker, months));
        System.out.println("На брокерском счету Ваня будет иметь :" + brokerInvoiceCounter(pay, pay_rise, percent_to_broker, months, percent_per_month));


    }

    private static double brokerInvoiceCounter(int pay, int pay_rise, int percent_to_broker, int months, int percent_per_month) {
        int cur_pay = pay;
        double invoice = 0;
        for (int i = 1; i <= months; i++) {
            invoice = invoice + (cur_pay * (double) percent_to_broker / 100) + (invoice * (double) percent_per_month / 100);
            if (isNeedPromotion(i)) {
                cur_pay += pay_rise;
            }
        }
        return invoice;
    }

    private static double ivanInvoiceCounter(int pay, int pay_rise, int spend, int percent_to_broker, int months) {
        int cur_pay = pay;
        double invoice = 0;
        for (int i = 1; i <= months; i++) {
            invoice = invoice + cur_pay - spend - ((double) percent_to_broker / 100 * cur_pay);
            if (isNeedPromotion(i)) {
                cur_pay += pay_rise;
            }
        }
        return invoice;
    }

    private static boolean isNeedPromotion(int month) {
        return month % 6 == 0;
    }
}
