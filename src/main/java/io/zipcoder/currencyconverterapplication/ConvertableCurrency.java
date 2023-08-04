package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.UniversalCurrency;

public interface ConvertableCurrency {

    default Double convertToUniversal(CurrencyType sourceCurrencyType){
        return sourceCurrencyType.getRate() * CurrencyType.UNIVERSAL_CURRENCY.getRate();
    }

    public CurrencyType getType();

    public Double convert(CurrencyType targetCurrencyType);



}
