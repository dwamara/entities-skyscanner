
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Query {

    @SerializedName("Country")
    @Expose
    private String Country;
    @SerializedName("Currency")
    @Expose
    private String Currency;
    @SerializedName("Locale")
    @Expose
    private String Locale;
    @SerializedName("Adults")
    @Expose
    private Integer Adults;
    @SerializedName("Children")
    @Expose
    private Integer Children;
    @SerializedName("Infants")
    @Expose
    private Integer Infants;
    @SerializedName("OriginPlace")
    @Expose
    private String OriginPlace;
    @SerializedName("DestinationPlace")
    @Expose
    private String DestinationPlace;
    @SerializedName("OutboundDate")
    @Expose
    private String OutboundDate;
    @SerializedName("InboundDate")
    @Expose
    private String InboundDate;
    @SerializedName("LocationSchema")
    @Expose
    private String LocationSchema;
    @SerializedName("CabinClass")
    @Expose
    private String CabinClass;
    @SerializedName("GroupPricing")
    @Expose
    private Boolean GroupPricing;

    /**
     * 
     * @return
     *     The Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * 
     * @param Country
     *     The Country
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * 
     * @return
     *     The Currency
     */
    public String getCurrency() {
        return Currency;
    }

    /**
     * 
     * @param Currency
     *     The Currency
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * 
     * @return
     *     The Locale
     */
    public String getLocale() {
        return Locale;
    }

    /**
     * 
     * @param Locale
     *     The Locale
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
    }

    /**
     * 
     * @return
     *     The Adults
     */
    public Integer getAdults() {
        return Adults;
    }

    /**
     * 
     * @param Adults
     *     The Adults
     */
    public void setAdults(Integer Adults) {
        this.Adults = Adults;
    }

    /**
     * 
     * @return
     *     The Children
     */
    public Integer getChildren() {
        return Children;
    }

    /**
     * 
     * @param Children
     *     The Children
     */
    public void setChildren(Integer Children) {
        this.Children = Children;
    }

    /**
     * 
     * @return
     *     The Infants
     */
    public Integer getInfants() {
        return Infants;
    }

    /**
     * 
     * @param Infants
     *     The Infants
     */
    public void setInfants(Integer Infants) {
        this.Infants = Infants;
    }

    /**
     * 
     * @return
     *     The OriginPlace
     */
    public String getOriginPlace() {
        return OriginPlace;
    }

    /**
     * 
     * @param OriginPlace
     *     The OriginPlace
     */
    public void setOriginPlace(String OriginPlace) {
        this.OriginPlace = OriginPlace;
    }

    /**
     * 
     * @return
     *     The DestinationPlace
     */
    public String getDestinationPlace() {
        return DestinationPlace;
    }

    /**
     * 
     * @param DestinationPlace
     *     The DestinationPlace
     */
    public void setDestinationPlace(String DestinationPlace) {
        this.DestinationPlace = DestinationPlace;
    }

    /**
     * 
     * @return
     *     The OutboundDate
     */
    public String getOutboundDate() {
        return OutboundDate;
    }

    /**
     * 
     * @param OutboundDate
     *     The OutboundDate
     */
    public void setOutboundDate(String OutboundDate) {
        this.OutboundDate = OutboundDate;
    }

    /**
     * 
     * @return
     *     The InboundDate
     */
    public String getInboundDate() {
        return InboundDate;
    }

    /**
     * 
     * @param InboundDate
     *     The InboundDate
     */
    public void setInboundDate(String InboundDate) {
        this.InboundDate = InboundDate;
    }

    /**
     * 
     * @return
     *     The LocationSchema
     */
    public String getLocationSchema() {
        return LocationSchema;
    }

    /**
     * 
     * @param LocationSchema
     *     The LocationSchema
     */
    public void setLocationSchema(String LocationSchema) {
        this.LocationSchema = LocationSchema;
    }

    /**
     * 
     * @return
     *     The CabinClass
     */
    public String getCabinClass() {
        return CabinClass;
    }

    /**
     * 
     * @param CabinClass
     *     The CabinClass
     */
    public void setCabinClass(String CabinClass) {
        this.CabinClass = CabinClass;
    }

    /**
     * 
     * @return
     *     The GroupPricing
     */
    public Boolean getGroupPricing() {
        return GroupPricing;
    }

    /**
     * 
     * @param GroupPricing
     *     The GroupPricing
     */
    public void setGroupPricing(Boolean GroupPricing) {
        this.GroupPricing = GroupPricing;
    }
}
