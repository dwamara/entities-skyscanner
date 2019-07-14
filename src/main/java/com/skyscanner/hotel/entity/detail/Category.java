
package com.skyscanner.hotel.entity.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category {

    @SerializedName("id") @Expose private String id;
    @SerializedName("name") @Expose private String name;
    @SerializedName("score") @Expose private String score;
    @SerializedName("entries")@Expose private List<String> entries = null;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }

    public List<String> getEntries() {
        return entries;
    }
    public void setEntries(List<String> entries) {
        this.entries = entries;
    }

}
