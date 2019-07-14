
package com.skyscanner.hotel.entity.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelDetailsResponse {

    @SerializedName("hotelPrice") @Expose private HotelPrice hotelPrice;

    public HotelPrice getHotelPrice() {
        return hotelPrice;
    }
    public void setHotelPrice(HotelPrice hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

}
