package com.kania201103722.login;

import com.google.gson.annotations.SerializedName;

public class ForexRootModel
{
    @SerializedName("rates")
    private ForexRatesModel forexRatesModel;

    public ForexRootModel () {}

    public ForexRatesModel getForexRatesModel() {
        return forexRatesModel;
    }

    public void setForexRatesModel(ForexRatesModel forexRatesModel) {
        this.forexRatesModel = forexRatesModel;
    }
}
