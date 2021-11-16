package TaxType;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal oneHundreed = new BigDecimal("100000");
        BigDecimal progressiveTaxType = amount.compareTo(oneHundreed)>0?BigDecimal.valueOf(0.15):BigDecimal.valueOf(0.1);
        BigDecimal multiply = amount.multiply(progressiveTaxType);
        return multiply;
    }
}
