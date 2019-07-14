
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Leg {

    @SerializedName("Id")
    @Expose
    private String Id;
    @SerializedName("SegmentIds")
    @Expose
    private List<Integer> SegmentIds = new ArrayList<Integer>();
    @SerializedName("OriginStation")
    @Expose
    private Integer OriginStation;
    @SerializedName("DestinationStation")
    @Expose
    private Integer DestinationStation;
    @SerializedName("Departure")
    @Expose
    private String Departure;
    @SerializedName("Arrival")
    @Expose
    private String Arrival;
    @SerializedName("Duration")
    @Expose
    private Integer Duration;
    @SerializedName("JourneyMode")
    @Expose
    private String JourneyMode;
    @SerializedName("Stops")
    @Expose
    private List<Integer> Stops = new ArrayList<Integer>();
    @SerializedName("Carriers")
    @Expose
    private List<Integer> Carriers = new ArrayList<Integer>();
    @SerializedName("OperatingCarriers")
    @Expose
    private List<Integer> OperatingCarriers = new ArrayList<Integer>();
    @SerializedName("Directionality")
    @Expose
    private String Directionality;
    @SerializedName("FlightNumbers")
    @Expose
    private List<FlightNumber> FlightNumbers = new ArrayList<FlightNumber>();

    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The SegmentIds
     */
    public List<Integer> getSegmentIds() {
        return SegmentIds;
    }

    /**
     * 
     * @param SegmentIds
     *     The SegmentIds
     */
    public void setSegmentIds(List<Integer> SegmentIds) {
        this.SegmentIds = SegmentIds;
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
     *     The Departure
     */
    public String getDeparture() {
        return Departure;
    }

    /**
     * 
     * @param Departure
     *     The Departure
     */
    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    /**
     * 
     * @return
     *     The Arrival
     */
    public String getArrival() {
        return Arrival;
    }

    /**
     * 
     * @param Arrival
     *     The Arrival
     */
    public void setArrival(String Arrival) {
        this.Arrival = Arrival;
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
     *     The Stops
     */
    public List<Integer> getStops() {
        return Stops;
    }

    /**
     * 
     * @param Stops
     *     The Stops
     */
    public void setStops(List<Integer> Stops) {
        this.Stops = Stops;
    }

    /**
     * 
     * @return
     *     The Carriers
     */
    public List<Integer> getCarriers() {
        return Carriers;
    }

    /**
     * 
     * @param Carriers
     *     The Carriers
     */
    public void setCarriers(List<Integer> Carriers) {
        this.Carriers = Carriers;
    }

    /**
     * 
     * @return
     *     The OperatingCarriers
     */
    public List<Integer> getOperatingCarriers() {
        return OperatingCarriers;
    }

    /**
     * 
     * @param OperatingCarriers
     *     The OperatingCarriers
     */
    public void setOperatingCarriers(List<Integer> OperatingCarriers) {
        this.OperatingCarriers = OperatingCarriers;
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

    /**
     * 
     * @return
     *     The FlightNumbers
     */
    public List<FlightNumber> getFlightNumbers() {
        return FlightNumbers;
    }

    /**
     * 
     * @param FlightNumbers
     *     The FlightNumbers
     */
    public void setFlightNumbers(List<FlightNumber> FlightNumbers) {
        this.FlightNumbers = FlightNumbers;
    }

}
