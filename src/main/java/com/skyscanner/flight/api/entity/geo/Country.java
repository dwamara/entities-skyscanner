
package com.skyscanner.flight.api.entity.geo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Country {

    @SerializedName("CurrencyId") @Expose private String CurrencyId;
    @SerializedName("Regions") @Expose private List<Object> Regions = new ArrayList<>();
    @SerializedName("Cities") @Expose private List<City> Cities = new ArrayList<>();
    @SerializedName("Id") @Expose private String Id;
    @SerializedName("Name") @Expose private String Name;

    public String getCurrencyId() {
        return CurrencyId;
    }
    public void setCurrencyId(String CurrencyId) {
        this.CurrencyId = CurrencyId;
    }

    public List<Object> getRegions() {
        return Regions;
    }
    public void setRegions(List<Object> Regions) {
        this.Regions = Regions;
    }

    public List<City> getCities() {
        return Cities;
    }
    public void setCities(List<City> Cities) {
        this.Cities = Cities;
    }

    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
}
