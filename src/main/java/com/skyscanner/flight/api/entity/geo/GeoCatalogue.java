
package com.skyscanner.flight.api.entity.geo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class GeoCatalogue {

    @SerializedName("Continents") @Expose private List<Continent> Continents = new ArrayList<>();

    public List<Continent> getContinents() {
        return Continents;
    }
    public void setContinents(List<Continent> Continents) {
        this.Continents = Continents;
    }
}
