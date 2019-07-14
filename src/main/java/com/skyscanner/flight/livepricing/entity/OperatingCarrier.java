
package com.skyscanner.flight.livepricing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OperatingCarrier {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("DisplayCode")
    @Expose
    private String displayCode;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The Code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The ImageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 
     * @return
     *     The displayCode
     */
    public String getDisplayCode() {
        return displayCode;
    }

    /**
     * 
     * @param displayCode
     *     The DisplayCode
     */
    public void setDisplayCode(String displayCode) {
        this.displayCode = displayCode;
    }

}
