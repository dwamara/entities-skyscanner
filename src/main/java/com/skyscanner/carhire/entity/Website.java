
package com.skyscanner.carhire.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Website {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("in_progress")
    @Expose
    private Boolean inProgress;
    @SerializedName("optimised_for_mobile")
    @Expose
    private Boolean optimisedForMobile;

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
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
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
     *     The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 
     * @return
     *     The inProgress
     */
    public Boolean getInProgress() {
        return inProgress;
    }

    /**
     * 
     * @param inProgress
     *     The in_progress
     */
    public void setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * 
     * @return
     *     The optimisedForMobile
     */
    public Boolean getOptimisedForMobile() {
        return optimisedForMobile;
    }

    /**
     * 
     * @param optimisedForMobile
     *     The optimised_for_mobile
     */
    public void setOptimisedForMobile(Boolean optimisedForMobile) {
        this.optimisedForMobile = optimisedForMobile;
    }

}
