
package com.skyscanner.carhire.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class SkyScannerCarHireResponse {

    @SerializedName("cars")
    @Expose
    private List<Car> cars = new ArrayList<Car>();
    @SerializedName("websites")
    @Expose
    private List<Website> websites = new ArrayList<Website>();
    @SerializedName("debug_items")
    @Expose
    private List<DebugItem> debugItems = new ArrayList<DebugItem>();

    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Website> getWebsites() {
        return websites;
    }
    public void setWebsites(List<Website> websites) {
        this.websites = websites;
    }

    public List<DebugItem> getDebugItems() {
        return debugItems;
    }
    public void setDebugItems(List<DebugItem> debugItems) {
        this.debugItems = debugItems;
    }
}
