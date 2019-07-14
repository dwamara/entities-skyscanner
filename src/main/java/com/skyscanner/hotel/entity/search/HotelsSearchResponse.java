
package com.skyscanner.hotel.entity.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.skyscanner.common.DebugItem;
import com.skyscanner.hotel.entity.common.Hotel;

import java.util.List;

public class HotelsSearchResponse {

    @SerializedName("hotels_prices") @Expose private List<HotelsPrice> hotelsPrices;
    @SerializedName("hotels") @Expose private List<Hotel> hotels;
    @SerializedName("agents") @Expose private List<Agent> agents;
    @SerializedName("amenities") @Expose private List<Amenity> amenities;
    @SerializedName("places") @Expose private List<Object> places;
    @SerializedName("urls") @Expose private Urls urls;
    @SerializedName("status") @Expose private String status;
    @SerializedName("total_hotels") @Expose private Integer totalHotels;
    @SerializedName("total_available_hotels") @Expose private Integer totalAvailableHotels;
    @SerializedName("last_update") @Expose private Long lastUpdate;
    @SerializedName("image_host_url") @Expose private String imageHostUrl;
    @SerializedName("debug_items") @Expose private List<DebugItem> debugItems;
    @SerializedName("images") @Expose private List<Object> images;

    public List<HotelsPrice> getHotelsPrices() {
        return hotelsPrices;
    }
    public void setHotelsPrices(List<HotelsPrice> hotelsPrices) {
        this.hotelsPrices = hotelsPrices;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }
    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Agent> getAgents() {
        return agents;
    }
    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    public List<Amenity> getAmenities() {
        return amenities;
    }
    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }

    public List<Object> getPlaces() {
        return places;
    }
    public void setPlaces(List<Object> places) {
        this.places = places;
    }

    public Urls getUrls() {
        return urls;
    }
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalHotels() {
        return totalHotels;
    }
    public void setTotalHotels(Integer totalHotels) {
        this.totalHotels = totalHotels;
    }

    public Integer getTotalAvailableHotels() {
        return totalAvailableHotels;
    }
    public void setTotalAvailableHotels(Integer totalAvailableHotels) {
        this.totalAvailableHotels = totalAvailableHotels;
    }

    public Long getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(Long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getImageHostUrl() {
        return imageHostUrl;
    }
    public void setImageHostUrl(String imageHostUrl) {
        this.imageHostUrl = imageHostUrl;
    }

    public List<DebugItem> getDebugItems() {
        return debugItems;
    }
    public void setDebugItems(List<DebugItem> debugItems) {
        this.debugItems = debugItems;
    }

    public List<Object> getImages() {
        return images;
    }
    public void setImages(List<Object> images) {
        this.images = images;
    }
}
