
package com.skyscanner.flight.api.entity.geo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Continent {

    @SerializedName("Countries") @Expose private List<Country> Countries = new ArrayList<>();
    @SerializedName("Id") @Expose private String Id;
    @SerializedName("Name") @Expose private String Name;

    public List<Country> getCountries() {
        return Countries;
    }
    public void setCountries(List<Country> Countries) {
        this.Countries = Countries;
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
