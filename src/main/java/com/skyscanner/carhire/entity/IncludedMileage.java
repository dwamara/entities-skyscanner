
package com.skyscanner.carhire.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class IncludedMileage {

    @SerializedName("unlimited")
    @Expose
    private Boolean unlimited;

    /**
     * 
     * @return
     *     The unlimited
     */
    public Boolean getUnlimited() {
        return unlimited;
    }

    /**
     * 
     * @param unlimited
     *     The unlimited
     */
    public void setUnlimited(Boolean unlimited) {
        this.unlimited = unlimited;
    }
}
