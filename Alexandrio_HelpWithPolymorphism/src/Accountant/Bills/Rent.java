package Accountant.Bills;

import Accountant.Bill;
import Accountant.Taxes.ProgressiveTaxType;
import Accountant.TaxType;

public class Rent extends Bill {
    public Rent(String name, double amount, TaxType taxType){
        super(name, amount,taxType);
    }
}