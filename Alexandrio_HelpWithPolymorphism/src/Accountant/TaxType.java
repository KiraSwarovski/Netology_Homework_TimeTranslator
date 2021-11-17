package Accountant;

/* Создадим класс-родитель для различных типов налогообложения */

public class TaxType {
   // public static double rate; // поле ставки, %//comment MaxRaitin -  зачем оно?


    public double calculateTaxFor(double amount) {
        // TODO override me!
        return 0.0;
    }
    public static void getBankRate(){

    }
}