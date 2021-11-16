package TaxType;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal incomeTaxType = new BigDecimal("0.13");
        return incomeTaxType.multiply(amount);
    }
}
