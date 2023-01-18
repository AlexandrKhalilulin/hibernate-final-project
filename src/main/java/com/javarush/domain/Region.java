package com.javarush.domain;

public enum Region {
    Caribbean("Caribbean"),
    SouthernAndCentralAsia("Southern and Central Asia"),
    CentralAfrica("Central Africa"),
    SouthernEurope("Southern Europe"),
    MiddleEast("Middle East"),
    SouthAmerica("South America"),
    Polynesia("Polynesia"),
    Antarctica("Antarctica"),
    AustraliaAndNewZealand("Australia and New Zealand"),
    WesternEurope("Western Europe"),
    EasternAfrica("Eastern Africa"),
    WesternAfrica("Western Africa"),
    EasternEurope("Eastern Europe"),
    CentralAmerica("Central America"),
    NorthAmerica("North America"),
    SoutheastAsia("Southeast Asia"),
    SouthernAfrica("Southern Africa"),
    EasternAsia("Eastern Asia"),
    NordicCountries("Nordic Countries"),
    NorthernAfrica("Northern Africa"),
    BalticCountries("Baltic Countries"),
    Melanesia("Melanesia"),
    Micronesia("Micronesia"),
    BritishIslands("British Islands"),
    MicronesiaCaribbean("Micronesia/Caribbean");

    private final String value;

    Region(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
