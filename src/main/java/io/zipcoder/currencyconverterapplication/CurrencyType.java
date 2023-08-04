package io.zipcoder.currencyconverterapplication;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70, "AUSTRAILIA"),
    CANADIAN_DOLLAR(2.64, "CANADA"),
    CHINESE_YR(13.84, "CHINESE"),
    EURO(1.88, "EURO"),
    FRANC(2.02, "FRANC"),
    POUND(1.64, "POUND"),
    RINGGIT(8.94, "RINGGIT"),
    RUPEE(136.64, "RUPEE"),
    SINGAPORE_DOLLAR(1.86, "SINGAPORE"),
    US_DOLLAR(2.0, "US"),
    UNIVERSAL_CURRENCY(1.0, "UNIVERSAL"),
    YEN(231.68, "YEN");

    private final double rate;
    private final String name;

    CurrencyType(double rate, String name) {
        this.rate = rate;
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        return currency.getType();
    }

    public String getName(){
        return name;
    }
}
