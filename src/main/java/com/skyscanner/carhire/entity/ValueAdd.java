
package com.skyscanner.carhire.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ValueAdd {

    @SerializedName("fuel")
    @Expose
    private Fuel fuel;
    @SerializedName("insurance")
    @Expose
    private Insurance insurance;
    @SerializedName("free_breakdown_assistance")
    @Expose
    private Boolean freeBreakdownAssistance;
    @SerializedName("included_mileage")
    @Expose
    private IncludedMileage includedMileage;

    public Fuel getFuel() {
        return fuel;
    }
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Insurance getInsurance() {
        return insurance;
    }
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Boolean getFreeBreakdownAssistance() {
        return freeBreakdownAssistance;
    }
    public void setFreeBreakdownAssistance(Boolean freeBreakdownAssistance) {
        this.freeBreakdownAssistance = freeBreakdownAssistance;
    }

    public IncludedMileage getIncludedMileage() {
        return includedMileage;
    }
    public void setIncludedMileage(IncludedMileage includedMileage) {
        this.includedMileage = includedMileage;
    }

}
