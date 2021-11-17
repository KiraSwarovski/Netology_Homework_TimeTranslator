package Accountant.Taxes;

/* Подоходный налог тут, = 13%*/

import Accountant.TaxType;

public class IncomeTaxType extends TaxType {
    private  double rateITT = 13.0; // ставка нэтого налога в %

    @Override
    public double calculateTaxFor(double amount) {
        return rateITT*amount;
    }

   public IncomeTaxType(){ //MaxRatin: зачем это?

    }

    @Override
    public String toString() {
        return ""+getClass().getSimpleName();
    }
}