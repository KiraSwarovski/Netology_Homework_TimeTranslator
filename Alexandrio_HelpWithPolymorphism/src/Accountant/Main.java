package Accountant;

import Accountant.Bills.*;
import Accountant.Taxes.*;
import Accountant.TaxType.*;

public class Main {
    /* В методе main создадим несколько счетов и оплатим с них налоги в налоговую службу. */

    public static void main(String[] args) {
        //todo TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{ // созд массив начислений
                // создать платежи с различным типами налогообложения
//                new Dividents("Дивиденды"),
                new Rent("Аренда", 100, new ProgressiveTaxType()),
//                new Sales("Продажи", 10, new IncomeTaxType())
        };
        // промежуточный чек
        System.out.println("У Вас создано " + payments.length +
                " счета. Их параметры:");
        System.out.println("название, сумма, вид налога, ставка");
//        for (int i = 0; i < payments.length; ++i) {
//            Bill bill = payments[i];
//            System.out.println(payments[i].name + " " + payments[i].amount + " " +
//                    payments[i].taxType + " " + bill.taxType.calculateTaxFor(i));
//            //todo Bill bill = payments[i];
//            //todo bill.payTaxes();
//        }
    }
}