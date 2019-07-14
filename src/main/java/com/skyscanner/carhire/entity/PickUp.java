
package com.skyscanner.carhire.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class PickUp {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("distance_to_search_location_in_km")
    @Expose
    private Double distanceToSearchLocationInKm;
    @SerializedName("geo_info")
    @Expose
    private List<Double> geoInfo = new ArrayList<Double>();

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The distanceToSearchLocationInKm
     */
    public Double getDistanceToSearchLocationInKm() {
        return distanceToSearchLocationInKm;
    }

    /**
     * 
     * @param distanceToSearchLocationInKm
     *     The distance_to_search_location_in_km
     */
    public void setDistanceToSearchLocationInKm(Double distanceToSearchLocationInKm) {
        this.distanceToSearchLocationInKm = distanceToSearchLocationInKm;
    }

    /**
     * 
     * @return
     *     The geoInfo
     */
    public List<Double> getGeoInfo() {
        return geoInfo;
    }

    /**
     * 
     * @param geoInfo
     *     The geo_info
     */
    public void setGeoInfo(List<Double> geoInfo) {
        this.geoInfo = geoInfo;
    }

}
