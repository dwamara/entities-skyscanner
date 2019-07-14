
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Itinerary {

    @SerializedName("OutboundLegId")
    @Expose
    private String OutboundLegId;
    @SerializedName("InboundLegId")
    @Expose
    private String InboundLegId;
    @SerializedName("PricingOptions")
    @Expose
    private List<PricingOption> PricingOptions = new ArrayList<PricingOption>();
    @SerializedName("BookingDetailsLink")
    @Expose
    private com.skyscanner.flight.livepricing.entity.sessionpolling.BookingDetailsLink BookingDetailsLink;

    /**
     * 
     * @return
     *     The OutboundLegId
     */
    public String getOutboundLegId() {
        return OutboundLegId;
    }

    /**
     * 
     * @param OutboundLegId
     *     The OutboundLegId
     */
    public void setOutboundLegId(String OutboundLegId) {
        this.OutboundLegId = OutboundLegId;
    }

    /**
     * 
     * @return
     *     The InboundLegId
     */
    public String getInboundLegId() {
        return InboundLegId;
    }

    /**
     * 
     * @param InboundLegId
     *     The InboundLegId
     */
    public void setInboundLegId(String InboundLegId) {
        this.InboundLegId = InboundLegId;
    }

    /**
     * 
     * @return
     *     The PricingOptions
     */
    public List<PricingOption> getPricingOptions() {
        return PricingOptions;
    }

    /**
     * 
     * @param PricingOptions
     *     The PricingOptions
     */
    public void setPricingOptions(List<PricingOption> PricingOptions) {
        this.PricingOptions = PricingOptions;
    }

    /**
     * 
     * @return
     *     The BookingDetailsLink
     */
    public com.skyscanner.flight.livepricing.entity.sessionpolling.BookingDetailsLink getBookingDetailsLink() {
        return BookingDetailsLink;
    }

    /**
     * 
     * @param BookingDetailsLink
     *     The BookingDetailsLink
     */
    public void setBookingDetailsLink(com.skyscanner.flight.livepricing.entity.sessionpolling.BookingDetailsLink BookingDetailsLink) {
        this.BookingDetailsLink = BookingDetailsLink;
    }
}
