
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Segment {

    @SerializedName("Id")
    @Expose
    private Integer Id;
    @SerializedName("OriginStation")
    @Expose
    private Integer OriginStation;
    @SerializedName("DestinationStation")
    @Expose
    private Integer DestinationStation;
    @SerializedName("DepartureDateTime")
    @Expose
    private String DepartureDateTime;
    @SerializedName("ArrivalDateTime")
    @Expose
    private String ArrivalDateTime;
    @SerializedName("Carrier")
    @Expose
    private Integer Carrier;
    @SerializedName("OperatingCarrier")
    @Expose
    private Integer OperatingCarrier;
    @SerializedName("Duration")
    @Expose
    private Integer Duration;
    @SerializedName("FlightNumber")
    @Expose
    private String FlightNumber;
    @SerializedName("JourneyMode")
    @Expose
    private String JourneyMode;
    @SerializedName("Directionality")
    @Expose
    private String Directionality;

    /**
     * 
     * @return
     *     The Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The OriginStation
     */
    public Integer getOriginStation() {
        return OriginStation;
    }

    /**
     * 
     * @param OriginStation
     *     The OriginStation
     */
    public void setOriginStation(Integer OriginStation) {
        this.OriginStation = OriginStation;
    }

    /**
     * 
     * @return
     *     The DestinationStation
     */
    public Integer getDestinationStation() {
        return DestinationStation;
    }

    /**
     * 
     * @param DestinationStation
     *     The DestinationStation
     */
    public void setDestinationStation(Integer DestinationStation) {
        this.DestinationStation = DestinationStation;
    }

    /**
     * 
     * @return
     *     The DepartureDateTime
     */
    public String getDepartureDateTime() {
        return DepartureDateTime;
    }

    /**
     * 
     * @param DepartureDateTime
     *     The DepartureDateTime
     */
    public void setDepartureDateTime(String DepartureDateTime) {
        this.DepartureDateTime = DepartureDateTime;
    }

    /**
     * 
     * @return
     *     The ArrivalDateTime
     */
    public String getArrivalDateTime() {
        return ArrivalDateTime;
    }

    /**
     * 
     * @param ArrivalDateTime
     *     The ArrivalDateTime
     */
    public void setArrivalDateTime(String ArrivalDateTime) {
        this.ArrivalDateTime = ArrivalDateTime;
    }

    /**
     * 
     * @return
     *     The Carrier
     */
    public Integer getCarrier() {
        return Carrier;
    }

    /**
     * 
     * @param Carrier
     *     The Carrier
     */
    public void setCarrier(Integer Carrier) {
        this.Carrier = Carrier;
    }

    /**
     * 
     * @return
     *     The OperatingCarrier
     */
    public Integer getOperatingCarrier() {
        return OperatingCarrier;
    }

    /**
     * 
     * @param OperatingCarrier
     *     The OperatingCarrier
     */
    public void setOperatingCarrier(Integer OperatingCarrier) {
        this.OperatingCarrier = OperatingCarrier;
    }

    /**
     * 
     * @return
     *     The Duration
     */
    public Integer getDuration() {
        return Duration;
    }

    /**
     * 
     * @param Duration
     *     The Duration
     */
    public void setDuration(Integer Duration) {
        this.Duration = Duration;
    }

    /**
     * 
     * @return
     *     The FlightNumber
     */
    public String getFlightNumber() {
        return FlightNumber;
    }

    /**
     * 
     * @param FlightNumber
     *     The FlightNumber
     */
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    /**
     * 
     * @return
     *     The JourneyMode
     */
    public String getJourneyMode() {
        return JourneyMode;
    }

    /**
     * 
     * @param JourneyMode
     *     The JourneyMode
     */
    public void setJourneyMode(String JourneyMode) {
        this.JourneyMode = JourneyMode;
    }

    /**
     * 
     * @return
     *     The Directionality
     */
    public String getDirectionality() {
        return Directionality;
    }

    /**
     * 
     * @param Directionality
     *     The Directionality
     */
    public void setDirectionality(String Directionality) {
        this.Directionality = Directionality;
    }
}
