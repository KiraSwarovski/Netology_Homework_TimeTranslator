package TaxType;

import java.math.BigDecimal;

public class VATaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal vataxtype = new BigDecimal(0.2);
        BigDecimal multiply = vataxtype.multiply(amount);
        return multiply;

    }
}
