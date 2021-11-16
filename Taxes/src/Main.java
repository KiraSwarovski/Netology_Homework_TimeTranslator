import TaxType.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(BigDecimal.valueOf(1111.11), new IncomeTaxType(),taxService),
                new Bill(BigDecimal.valueOf(2222.22), new VATaxType(),taxService),
                new Bill(BigDecimal.valueOf(3333.33), new ProgressiveTaxType(),taxService),
                new Bill(BigDecimal.valueOf(133333.33), new ProgressiveTaxType(),taxService),
        };
        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
