
package com.skyscanner.hotel.entity.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Agent {

    @SerializedName("id") @Expose private Integer id;
    @SerializedName("name") @Expose private String name;
    @SerializedName("image_url") @Expose private String imageUrl;
    @SerializedName("in_progress") @Expose private Boolean inProgress;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getInProgress() {
        return inProgress;
    }
    public void setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }
}
