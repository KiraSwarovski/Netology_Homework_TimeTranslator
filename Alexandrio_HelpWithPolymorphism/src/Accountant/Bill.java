package Accountant;

/* Класс-предок для счетов */

public class Bill {
    public String name; // название счета
    protected double amount; // сумма для налооблажения
    protected TaxType taxType; // вид налогооблжения
    //todo private TaxService taxService; // протокол общения с ИФНС

    // дефолтный конструктор каждого нового счета
//    public Bill(String name, double amount) {//todo:, TaxType taxType, TaxService taxService) {
//        this.name = name;
//        this.amount = amount;
//        //this.taxType = taxType;
//        // this.taxService = taxService;
//    }

//    public Bill(String name) {
//        // конструктор-заглушка для отладки
//        this.name = name;
//    }

//     конструктор#1 - постепенно расширяем функционал
    public Bill(String name, double amount, TaxType taxType) {
        this.name = name;
        this.amount = amount;
//       this.taxType = taxType;
    }

}