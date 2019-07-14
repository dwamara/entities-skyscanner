
package com.skyscanner.flight.livepricing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Query {

    @SerializedName("Country")
    @Expose
    private String country;
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("Locale")
    @Expose
    private String locale;
    @SerializedName("Adults")
    @Expose
    private Integer adults;
    @SerializedName("Children")
    @Expose
    private Integer children;
    @SerializedName("Infants")
    @Expose
    private Integer infants;
    @SerializedName("OriginPlace")
    @Expose
    private String originPlace;
    @SerializedName("DestinationPlace")
    @Expose
    private String destinationPlace;
    @SerializedName("OutboundDate")
    @Expose
    private String outboundDate;
    @SerializedName("InboundDate")
    @Expose
    private String inboundDate;
    @SerializedName("LocationSchema")
    @Expose
    private String locationSchema;
    @SerializedName("CabinClass")
    @Expose
    private String cabinClass;
    @SerializedName("GroupPricing")
    @Expose
    private Boolean groupPricing;

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The Country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The Currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * 
     * @param locale
     *     The Locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * 
     * @return
     *     The adults
     */
    public Integer getAdults() {
        return adults;
    }

    /**
     * 
     * @param adults
     *     The Adults
     */
    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    /**
     * 
     * @return
     *     The children
     */
    public Integer getChildren() {
        return children;
    }

    /**
     * 
     * @param children
     *     The Children
     */
    public void setChildren(Integer children) {
        this.children = children;
    }

    /**
     * 
     * @return
     *     The infants
     */
    public Integer getInfants() {
        return infants;
    }

    /**
     * 
     * @param infants
     *     The Infants
     */
    public void setInfants(Integer infants) {
        this.infants = infants;
    }

    /**
     * 
     * @return
     *     The originPlace
     */
    public String getOriginPlace() {
        return originPlace;
    }

    /**
     * 
     * @param originPlace
     *     The OriginPlace
     */
    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    /**
     * 
     * @return
     *     The destinationPlace
     */
    public String getDestinationPlace() {
        return destinationPlace;
    }

    /**
     * 
     * @param destinationPlace
     *     The DestinationPlace
     */
    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    /**
     * 
     * @return
     *     The outboundDate
     */
    public String getOutboundDate() {
        return outboundDate;
    }

    /**
     * 
     * @param outboundDate
     *     The OutboundDate
     */
    public void setOutboundDate(String outboundDate) {
        this.outboundDate = outboundDate;
    }

    /**
     * 
     * @return
     *     The inboundDate
     */
    public String getInboundDate() {
        return inboundDate;
    }

    /**
     * 
     * @param inboundDate
     *     The InboundDate
     */
    public void setInboundDate(String inboundDate) {
        this.inboundDate = inboundDate;
    }

    /**
     * 
     * @return
     *     The locationSchema
     */
    public String getLocationSchema() {
        return locationSchema;
    }

    /**
     * 
     * @param locationSchema
     *     The LocationSchema
     */
    public void setLocationSchema(String locationSchema) {
        this.locationSchema = locationSchema;
    }

    /**
     * 
     * @return
     *     The cabinClass
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * 
     * @param cabinClass
     *     The CabinClass
     */
    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    /**
     * 
     * @return
     *     The groupPricing
     */
    public Boolean getGroupPricing() {
        return groupPricing;
    }

    /**
     * 
     * @param groupPricing
     *     The GroupPricing
     */
    public void setGroupPricing(Boolean groupPricing) {
        this.groupPricing = groupPricing;
    }

}
