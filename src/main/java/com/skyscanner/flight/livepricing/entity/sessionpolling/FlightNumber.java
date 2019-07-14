
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class FlightNumber {
    @SerializedName("FlightNumber") @Expose private String FlightNumber;
    @SerializedName("CarrierId") @Expose private Integer CarrierId;

    public String getFlightNumber() {
        return FlightNumber;
    }
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    public Integer getCarrierId() {
        return CarrierId;
    }
    public void setCarrierId(Integer CarrierId) {
        this.CarrierId = CarrierId;
    }
}
