
package com.skyscanner.hotel.entity.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Urls {

    @SerializedName("hotel_details")
    @Expose
    private String hotelDetails;

    /**
     * 
     * @return
     *     The hotelDetails
     */
    public String getHotelDetails() {
        return hotelDetails;
    }

    /**
     * 
     * @param hotelDetails
     *     The hotel_details
     */
    public void setHotelDetails(String hotelDetails) {
        this.hotelDetails = hotelDetails;
    }

}
