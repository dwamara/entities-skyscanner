
package com.skyscanner.carhire.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Car {

    @SerializedName("sipp")
    @Expose
    private String sipp;
    @SerializedName("image_id")
    @Expose
    private Integer imageId;
    @SerializedName("price_all_days")
    @Expose
    private Double priceAllDays;
    @SerializedName("seats")
    @Expose
    private Integer seats;
    @SerializedName("doors")
    @Expose
    private Integer doors;
    @SerializedName("bags")
    @Expose
    private Integer bags;
    @SerializedName("manual")
    @Expose
    private Boolean manual;
    @SerializedName("air_conditioning")
    @Expose
    private Boolean airConditioning;
    @SerializedName("mandatory_chauffeur")
    @Expose
    private Boolean mandatoryChauffeur;
    @SerializedName("website_id")
    @Expose
    private String websiteId;
    @SerializedName("vehicle")
    @Expose
    private String vehicle;
    @SerializedName("deeplink_url")
    @Expose
    private String deeplinkUrl;
    @SerializedName("car_class_id")
    @Expose
    private Integer carClassId;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("value_add")
    @Expose
    private ValueAdd valueAdd;

    /**
     * 
     * @return
     *     The sipp
     */
    public String getSipp() {
        return sipp;
    }

    /**
     * 
     * @param sipp
     *     The sipp
     */
    public void setSipp(String sipp) {
        this.sipp = sipp;
    }

    /**
     * 
     * @return
     *     The imageId
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * 
     * @param imageId
     *     The image_id
     */
    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    /**
     * 
     * @return
     *     The priceAllDays
     */
    public Double getPriceAllDays() {
        return priceAllDays;
    }

    /**
     * 
     * @param priceAllDays
     *     The price_all_days
     */
    public void setPriceAllDays(Double priceAllDays) {
        this.priceAllDays = priceAllDays;
    }

    /**
     * 
     * @return
     *     The seats
     */
    public Integer getSeats() {
        return seats;
    }

    /**
     * 
     * @param seats
     *     The seats
     */
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    /**
     * 
     * @return
     *     The doors
     */
    public Integer getDoors() {
        return doors;
    }

    /**
     * 
     * @param doors
     *     The doors
     */
    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    /**
     * 
     * @return
     *     The bags
     */
    public Integer getBags() {
        return bags;
    }

    /**
     * 
     * @param bags
     *     The bags
     */
    public void setBags(Integer bags) {
        this.bags = bags;
    }

    /**
     * 
     * @return
     *     The manual
     */
    public Boolean getManual() {
        return manual;
    }

    /**
     * 
     * @param manual
     *     The manual
     */
    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    /**
     * 
     * @return
     *     The airConditioning
     */
    public Boolean getAirConditioning() {
        return airConditioning;
    }

    /**
     * 
     * @param airConditioning
     *     The air_conditioning
     */
    public void setAirConditioning(Boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    /**
     * 
     * @return
     *     The mandatoryChauffeur
     */
    public Boolean getMandatoryChauffeur() {
        return mandatoryChauffeur;
    }

    /**
     * 
     * @param mandatoryChauffeur
     *     The mandatory_chauffeur
     */
    public void setMandatoryChauffeur(Boolean mandatoryChauffeur) {
        this.mandatoryChauffeur = mandatoryChauffeur;
    }

    /**
     * 
     * @return
     *     The websiteId
     */
    public String getWebsiteId() {
        return websiteId;
    }

    /**
     * 
     * @param websiteId
     *     The website_id
     */
    public void setWebsiteId(String websiteId) {
        this.websiteId = websiteId;
    }

    /**
     * 
     * @return
     *     The vehicle
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * 
     * @param vehicle
     *     The vehicle
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * 
     * @return
     *     The deeplinkUrl
     */
    public String getDeeplinkUrl() {
        return deeplinkUrl;
    }

    /**
     * 
     * @param deeplinkUrl
     *     The deeplink_url
     */
    public void setDeeplinkUrl(String deeplinkUrl) {
        this.deeplinkUrl = deeplinkUrl;
    }

    /**
     * 
     * @return
     *     The carClassId
     */
    public Integer getCarClassId() {
        return carClassId;
    }

    /**
     * 
     * @param carClassId
     *     The car_class_id
     */
    public void setCarClassId(Integer carClassId) {
        this.carClassId = carClassId;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The valueAdd
     */
    public ValueAdd getValueAdd() {
        return valueAdd;
    }

    /**
     * 
     * @param valueAdd
     *     The value_add
     */
    public void setValueAdd(ValueAdd valueAdd) {
        this.valueAdd = valueAdd;
    }

}
