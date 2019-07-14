
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.skyscanner.flight.livepricing.entity.Carrier;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class SessionPollingResponse {

    @SerializedName("SessionKey") @Expose private String SessionKey;
    @SerializedName("Query") @Expose private com.skyscanner.flight.livepricing.entity.sessionpolling.Query Query;
    @SerializedName("Status") @Expose private String Status;
    @SerializedName("Itineraries") @Expose private List<Itinerary> Itineraries = new ArrayList<Itinerary>();
    @SerializedName("Legs") @Expose private List<Leg> Legs = new ArrayList<Leg>();
    @SerializedName("Segments") @Expose private List<Segment> Segments = new ArrayList<Segment>();
    @SerializedName("Carriers") @Expose private List<Carrier> Carriers = new ArrayList<Carrier>();
    @SerializedName("Agents") @Expose private List<Agent> Agents = new ArrayList<Agent>();
    @SerializedName("Places") @Expose private List<Place> Places = new ArrayList<Place>();
    @SerializedName("Currencies") @Expose private List<Currency> Currencies = new ArrayList<Currency>();

    public String getSessionKey() {
        return SessionKey;
    }
    public void setSessionKey(String SessionKey) {
        this.SessionKey = SessionKey;
    }

    public com.skyscanner.flight.livepricing.entity.sessionpolling.Query getQuery() {
        return Query;
    }
    public void setQuery(com.skyscanner.flight.livepricing.entity.sessionpolling.Query Query) {
        this.Query = Query;
    }

    public String getStatus() {
        return Status;
    }
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public List<Itinerary> getItineraries() {
        return Itineraries;
    }
    public void setItineraries(List<Itinerary> Itineraries) {
        this.Itineraries = Itineraries;
    }

    public List<Leg> getLegs() {
        return Legs;
    }
    public void setLegs(List<Leg> Legs) {
        this.Legs = Legs;
    }

    public List<Segment> getSegments() {
        return Segments;
    }
    public void setSegments(List<Segment> Segments) {
        this.Segments = Segments;
    }

    public List<Carrier> getCarriers() {
        return Carriers;
    }
    public void setCarriers(List<Carrier> Carriers) {
        this.Carriers = Carriers;
    }

    public List<Agent> getAgents() {
        return Agents;
    }
    public void setAgents(List<Agent> Agents) {
        this.Agents = Agents;
    }

    public List<Place> getPlaces() {
        return Places;
    }
    public void setPlaces(List<Place> Places) {
        this.Places = Places;
    }

    public List<Currency> getCurrencies() {
        return Currencies;
    }
    public void setCurrencies(List<Currency> Currencies) {
        this.Currencies = Currencies;
    }
}
