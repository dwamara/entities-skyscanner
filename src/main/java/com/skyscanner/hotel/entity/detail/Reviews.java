
package com.skyscanner.hotel.entity.detail;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reviews {

    @SerializedName("count")
    @Expose
    private String count;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("guest_types")
    @Expose
    private List<GuestType> guestTypes = null;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;

    /**
     * 
     * @return
     *     The count
     */
    public String getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 
     * @return
     *     The guestTypes
     */
    public List<GuestType> getGuestTypes() {
        return guestTypes;
    }

    /**
     * 
     * @param guestTypes
     *     The guest_types
     */
    public void setGuestTypes(List<GuestType> guestTypes) {
        this.guestTypes = guestTypes;
    }

    /**
     * 
     * @return
     *     The categories
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
