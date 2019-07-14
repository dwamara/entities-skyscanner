
package com.skyscanner.flight.livepricing.entity.bookingdetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookingOption {

    @SerializedName("BookingItems") @Expose private List<BookingItem> bookingItems = null;

    public List<BookingItem> getBookingItems() {
        return bookingItems;
    }
    public void setBookingItems(List<BookingItem> bookingItems) {
        this.bookingItems = bookingItems;
    }

}
