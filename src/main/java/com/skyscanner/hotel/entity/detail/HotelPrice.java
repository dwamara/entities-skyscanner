
package com.skyscanner.hotel.entity.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.skyscanner.hotel.entity.common.AgentPrice;
import com.skyscanner.hotel.entity.common.Hotel;

import java.util.List;

public class HotelPrice {

    @SerializedName("id") @Expose private Integer id;
    @SerializedName("agent_prices") @Expose private List<AgentPrice> agentPrices;
    @SerializedName("reviews") @Expose private Reviews reviews;
    @SerializedName("hotels") @Expose private Hotel hotel;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public List<AgentPrice> getAgentPrices() {
        return agentPrices;
    }
    public void setAgentPrices(List<AgentPrice> agentPrices) {
        this.agentPrices = agentPrices;
    }

    public Reviews getReviews() {
        return reviews;
    }
    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
