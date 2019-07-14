
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Currency {

    @SerializedName("Code")
    @Expose
    private String Code;
    @SerializedName("Symbol")
    @Expose
    private String Symbol;
    @SerializedName("ThousandsSeparator")
    @Expose
    private String ThousandsSeparator;
    @SerializedName("DecimalSeparator")
    @Expose
    private String DecimalSeparator;
    @SerializedName("SymbolOnLeft")
    @Expose
    private Boolean SymbolOnLeft;
    @SerializedName("SpaceBetweenAmountAndSymbol")
    @Expose
    private Boolean SpaceBetweenAmountAndSymbol;
    @SerializedName("RoundingCoefficient")
    @Expose
    private Integer RoundingCoefficient;
    @SerializedName("DecimalDigits")
    @Expose
    private Integer DecimalDigits;

    public String getCode() {
        return Code;
    }
    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getSymbol() {
        return Symbol;
    }
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public String getThousandsSeparator() {
        return ThousandsSeparator;
    }
    public void setThousandsSeparator(String ThousandsSeparator) {
        this.ThousandsSeparator = ThousandsSeparator;
    }

    public String getDecimalSeparator() {
        return DecimalSeparator;
    }
    public void setDecimalSeparator(String DecimalSeparator) {
        this.DecimalSeparator = DecimalSeparator;
    }

    public Boolean getSymbolOnLeft() {
        return SymbolOnLeft;
    }
    public void setSymbolOnLeft(Boolean SymbolOnLeft) {
        this.SymbolOnLeft = SymbolOnLeft;
    }

    public Boolean getSpaceBetweenAmountAndSymbol() {
        return SpaceBetweenAmountAndSymbol;
    }
    public void setSpaceBetweenAmountAndSymbol(Boolean SpaceBetweenAmountAndSymbol) {
        this.SpaceBetweenAmountAndSymbol = SpaceBetweenAmountAndSymbol;
    }

    public Integer getRoundingCoefficient() {
        return RoundingCoefficient;
    }
    public void setRoundingCoefficient(Integer RoundingCoefficient) {
        this.RoundingCoefficient = RoundingCoefficient;
    }

    public Integer getDecimalDigits() {
        return DecimalDigits;
    }
    public void setDecimalDigits(Integer DecimalDigits) {
        this.DecimalDigits = DecimalDigits;
    }
}
