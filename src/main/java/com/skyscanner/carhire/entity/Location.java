
package com.skyscanner.carhire.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Location {

    @SerializedName("pick_up")
    @Expose
    private PickUp pickUp;

    /**
     * 
     * @return
     *     The pickUp
     */
    public PickUp getPickUp() {
        return pickUp;
    }

    /**
     * 
     * @param pickUp
     *     The pick_up
     */
    public void setPickUp(PickUp pickUp) {
        this.pickUp = pickUp;
    }

}
