
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class PricingOption {

    @SerializedName("Agents")
    @Expose
    private List<Integer> Agents = new ArrayList<Integer>();
    @SerializedName("QuoteAgeInMinutes")
    @Expose
    private Integer QuoteAgeInMinutes;
    @SerializedName("Price")
    @Expose
    private Double Price;
    @SerializedName("DeeplinkUrl")
    @Expose
    private String DeeplinkUrl;

    /**
     * 
     * @return
     *     The Agents
     */
    public List<Integer> getAgents() {
        return Agents;
    }

    /**
     * 
     * @param Agents
     *     The Agents
     */
    public void setAgents(List<Integer> Agents) {
        this.Agents = Agents;
    }

    /**
     * 
     * @return
     *     The QuoteAgeInMinutes
     */
    public Integer getQuoteAgeInMinutes() {
        return QuoteAgeInMinutes;
    }

    /**
     * 
     * @param QuoteAgeInMinutes
     *     The QuoteAgeInMinutes
     */
    public void setQuoteAgeInMinutes(Integer QuoteAgeInMinutes) {
        this.QuoteAgeInMinutes = QuoteAgeInMinutes;
    }

    /**
     * 
     * @return
     *     The Price
     */
    public Double getPrice() {
        return Price;
    }

    /**
     * 
     * @param Price
     *     The Price
     */
    public void setPrice(Double Price) {
        this.Price = Price;
    }

    /**
     * 
     * @return
     *     The DeeplinkUrl
     */
    public String getDeeplinkUrl() {
        return DeeplinkUrl;
    }

    /**
     * 
     * @param DeeplinkUrl
     *     The DeeplinkUrl
     */
    public void setDeeplinkUrl(String DeeplinkUrl) {
        this.DeeplinkUrl = DeeplinkUrl;
    }
}
