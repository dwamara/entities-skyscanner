
package com.skyscanner.carhire.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Insurance {

    @SerializedName("theft_protection")
    @Expose
    private Boolean theftProtection;
    @SerializedName("free_collision_waiver")
    @Expose
    private Boolean freeCollisionWaiver;

    /**
     * 
     * @return
     *     The theftProtection
     */
    public Boolean getTheftProtection() {
        return theftProtection;
    }

    /**
     * 
     * @param theftProtection
     *     The theft_protection
     */
    public void setTheftProtection(Boolean theftProtection) {
        this.theftProtection = theftProtection;
    }

    /**
     * 
     * @return
     *     The freeCollisionWaiver
     */
    public Boolean getFreeCollisionWaiver() {
        return freeCollisionWaiver;
    }

    /**
     * 
     * @param freeCollisionWaiver
     *     The free_collision_waiver
     */
    public void setFreeCollisionWaiver(Boolean freeCollisionWaiver) {
        this.freeCollisionWaiver = freeCollisionWaiver;
    }
}
