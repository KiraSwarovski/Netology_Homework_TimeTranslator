package Accountant.Taxes;

/* Прогрессивный налог, до 100 тысяч = 10%, больше 100 тысяч = 15% */

import Accountant.TaxType;

public class ProgressiveTaxType extends TaxType {
    private  double ratePTT = 20.0;

    public ProgressiveTaxType() {

    }

    @Override
    public double calculateTaxFor(double amount) {
        return ratePTT*amount;
    }


    @Override
    public String toString() {
        return " "+getClass().getSimpleName();
    }
}