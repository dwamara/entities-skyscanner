
package com.skyscanner.hotel.entity.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestType {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("perc")
    @Expose
    private String perc;
    @SerializedName("score")
    @Expose
    private String score;
    @SerializedName("value")
    @Expose
    private String value;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The perc
     */
    public String getPerc() {
        return perc;
    }

    /**
     * 
     * @param perc
     *     The perc
     */
    public void setPerc(String perc) {
        this.perc = perc;
    }

    /**
     * 
     * @return
     *     The score
     */
    public String getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(String score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

}
