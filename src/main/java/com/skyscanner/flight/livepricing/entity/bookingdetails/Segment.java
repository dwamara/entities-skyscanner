
package com.skyscanner.flight.livepricing.entity.bookingdetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.skyscanner.flight.livepricing.entity.Carrier;

public class Segment {

    @SerializedName("Id") @Expose private Integer id;
    @SerializedName("OriginStation") @Expose private OriginStation originStation;
    @SerializedName("DestinationStation") @Expose private DestinationStation destinationStation;
    @SerializedName("DepartureDateTime") @Expose private String departureDateTime;
    @SerializedName("ArrivalDateTime") @Expose private String arrivalDateTime;
    @SerializedName("Carrier") @Expose private Carrier carrier;
    @SerializedName("OperatingCarrier") @Expose private OperatingCarrier operatingCarrier;
    @SerializedName("Duration") @Expose private Integer duration;
    @SerializedName("FlightNumber") @Expose private String flightNumber;
    @SerializedName("JourneyMode") @Expose private String journeyMode;
    @SerializedName("Directionality") @Expose private String directionality;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public OriginStation getOriginStation() {
        return originStation;
    }
    public void setOriginStation(OriginStation originStation) {
        this.originStation = originStation;
    }

    public DestinationStation getDestinationStation() {
        return destinationStation;
    }
    public void setDestinationStation(DestinationStation destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Carrier getCarrier() {
        return carrier;
    }
    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }
    public void setOperatingCarrier(OperatingCarrier operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getJourneyMode() {
        return journeyMode;
    }
    public void setJourneyMode(String journeyMode) {
        this.journeyMode = journeyMode;
    }

    public String getDirectionality() {
        return directionality;
    }
    public void setDirectionality(String directionality) {
        this.directionality = directionality;
    }

}
