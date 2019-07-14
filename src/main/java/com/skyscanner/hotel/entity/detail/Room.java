
package com.skyscanner.hotel.entity.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Room {

    @SerializedName("adults")
    @Expose
    private Integer adults;
    @SerializedName("children")
    @Expose
    private Integer children;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("type_id")
    @Expose
    private String typeId;

    /**
     * 
     * @return
     *     The adults
     */
    public Integer getAdults() {
        return adults;
    }

    /**
     * 
     * @param adults
     *     The adults
     */
    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    /**
     * 
     * @return
     *     The children
     */
    public Integer getChildren() {
        return children;
    }

    /**
     * 
     * @param children
     *     The children
     */
    public void setChildren(Integer children) {
        this.children = children;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The typeId
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 
     * @param typeId
     *     The type_id
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

}
