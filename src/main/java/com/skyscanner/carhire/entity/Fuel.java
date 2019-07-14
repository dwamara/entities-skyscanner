
package com.skyscanner.carhire.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Fuel {

    @SerializedName("policy")
    @Expose
    private String policy;
    @SerializedName("fair")
    @Expose
    private Boolean fair;

    /**
     * 
     * @return
     *     The policy
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * 
     * @param policy
     *     The policy
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * 
     * @return
     *     The fair
     */
    public Boolean getFair() {
        return fair;
    }

    /**
     * 
     * @param fair
     *     The fair
     */
    public void setFair(Boolean fair) {
        this.fair = fair;
    }

}
