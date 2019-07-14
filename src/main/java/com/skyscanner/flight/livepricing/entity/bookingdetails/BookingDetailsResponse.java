
package com.skyscanner.flight.livepricing.entity.bookingdetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.skyscanner.flight.livepricing.entity.Carrier;

import java.util.List;

public class BookingDetailsResponse {

    @SerializedName("Segments") @Expose private List<Segment> segments;
    @SerializedName("BookingOptions") @Expose private List<BookingOption> bookingOptions;
    @SerializedName("Places") @Expose private List<Place> places;
    @SerializedName("Carriers") @Expose private List<Carrier> carriers;
    @SerializedName("Query") @Expose private Query query;

    public List<Segment> getSegments() {
        return segments;
    }
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public List<BookingOption> getBookingOptions() {
        return bookingOptions;
    }
    public void setBookingOptions(List<BookingOption> bookingOptions) {
        this.bookingOptions = bookingOptions;
    }

    public List<Place> getPlaces() {
        return places;
    }
    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public List<Carrier> getCarriers() {
        return carriers;
    }
    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

    public Query getQuery() {
        return query;
    }
    public void setQuery(Query query) {
        this.query = query;
    }

}
