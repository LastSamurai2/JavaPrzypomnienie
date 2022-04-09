package com.company;

public enum Country {
    USA("English","US",5000000000.0),
    POLAND("Polish","PL",5000000000.0),
    GERMANY("German","GR",4000000000.0);

    final String language;
    final String countryCode;
    Double GDP;

    Country(String language,String countryCode, double GDP) {
        this.language = language;
        this.countryCode = countryCode;
        this.GDP=GDP;
    }

    public Double gdpInPLN(){
        return this.GDP*4.27;
    }
}
