
package com.skyscanner.flight.livepricing.entity.bookingdetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookingItem {

    @SerializedName("AgentID") @Expose private Integer agentID;
    @SerializedName("Status") @Expose private String status;
    @SerializedName("Price") @Expose private Double price;
    @SerializedName("Deeplink") @Expose private String deeplink;
    @SerializedName("SegmentIds") @Expose private List<Integer> segmentIds = null;

    public Integer getAgentID() {
        return agentID;
    }
    public void setAgentID(Integer agentID) {
        this.agentID = agentID;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDeeplink() {
        return deeplink;
    }
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public List<Integer> getSegmentIds() {
        return segmentIds;
    }
    public void setSegmentIds(List<Integer> segmentIds) {
        this.segmentIds = segmentIds;
    }

}
