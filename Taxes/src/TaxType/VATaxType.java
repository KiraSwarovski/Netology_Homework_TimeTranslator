package TaxType;

import java.math.BigDecimal;

public class VATaxType extends TaxType {
    @Override
    public long calculateTaxFor(BigDecimal amount) {
        BigDecimal vataxtype = new BigDecimal(0.2);
        BigDecimal multiply = vataxtype.multiply(amount);
        return vataxtype;

    }
}
