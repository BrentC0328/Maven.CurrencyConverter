package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.UNIVERSAL_CURRENCY;
    public CurrencyType getType() {
        return type;
    }

    @Override
    public Double convert(CurrencyType targetCurrencyType) {
        return targetCurrencyType.getRate() / type.getRate();
    }
}
