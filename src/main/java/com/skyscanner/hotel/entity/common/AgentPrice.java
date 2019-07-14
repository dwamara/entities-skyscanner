
package com.skyscanner.hotel.entity.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.skyscanner.hotel.entity.detail.RoomOffer;

import java.util.List;

public class AgentPrice {

    @SerializedName("id") @Expose private Integer id;
    @SerializedName("price_per_room_night") @Expose private Integer pricePerRoomNight;
    @SerializedName("price_total") @Expose private Integer priceTotal;
    @SerializedName("deeplink") @Expose private String deeplink;
    @SerializedName("booking_deeplink") @Expose private String bookingDeeplink;
    @SerializedName("room_offers") @Expose private List<RoomOffer> roomOffers;
    @SerializedName("image_url") @Expose private String imageUrl;
    @SerializedName("name") @Expose private String name;
    @SerializedName("available_rooms") @Expose private Integer availableRooms;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPricePerRoomNight() {
        return pricePerRoomNight;
    }
    public void setPricePerRoomNight(Integer pricePerRoomNight) {
        this.pricePerRoomNight = pricePerRoomNight;
    }

    public Integer getPriceTotal() {
        return priceTotal;
    }
    public void setPriceTotal(Integer priceTotal) {
        this.priceTotal = priceTotal;
    }

    public String getDeeplink() {
        return deeplink;
    }
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public String getBookingDeeplink() {
        return bookingDeeplink;
    }
    public void setBookingDeeplink(String bookingDeeplink) {
        this.bookingDeeplink = bookingDeeplink;
    }

    public List<RoomOffer> getRoomOffers() {
        return roomOffers;
    }
    public void setRoomOffers(List<RoomOffer> roomOffers) {
        this.roomOffers = roomOffers;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAvailableRooms() {
        return availableRooms;
    }
    public void setAvailableRooms(Integer availableRooms) {
        this.availableRooms = availableRooms;
    }
}
