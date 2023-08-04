package io.zipcoder.currencyconverterapplication;

import java.util.spi.CurrencyNameProvider;

public class CurrencyConverter implements ConvertableCurrency{
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrency, CurrencyType targetCurrencyType) {

        CurrencyType sourceType = sourceCurrency.getType();
        Double universalSource = sourceType.getRate() * CurrencyType.UNIVERSAL_CURRENCY.getRate();

        Double universalTarget = targetCurrencyType.getRate() * CurrencyType.UNIVERSAL_CURRENCY.getRate();



        return (universalTarget / universalSource) * amountOfBaseCurrency;
    }

    @Override
    public CurrencyType getType() {
        return null;
    }

    @Override
    public Double convert(CurrencyType targetCurrencyType) {
        return null;
    }
}
