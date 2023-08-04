package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {

    private CurrencyType type = CurrencyType.YEN;

    public CurrencyType getType() {
        return type;
    }

    @Override
    public Double convert(CurrencyType targetCurrencyType) {
        return targetCurrencyType.getRate() / type.getRate();
    }
}
