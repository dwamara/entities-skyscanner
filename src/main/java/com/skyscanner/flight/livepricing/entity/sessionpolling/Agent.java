
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Agent {

    @SerializedName("Id")
    @Expose
    private Integer Id;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;
    @SerializedName("Status")
    @Expose
    private String Status;
    @SerializedName("OptimisedForMobile")
    @Expose
    private Boolean OptimisedForMobile;
    @SerializedName("BookingNumber")
    @Expose
    private String BookingNumber;
    @SerializedName("Type")
    @Expose
    private String Type;

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
     *     The Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 
     * @param Name
     *     The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 
     * @return
     *     The ImageUrl
     */
    public String getImageUrl() {
        return ImageUrl;
    }

    /**
     * 
     * @param ImageUrl
     *     The ImageUrl
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * 
     * @return
     *     The Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * 
     * @param Status
     *     The Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 
     * @return
     *     The OptimisedForMobile
     */
    public Boolean getOptimisedForMobile() {
        return OptimisedForMobile;
    }

    /**
     * 
     * @param OptimisedForMobile
     *     The OptimisedForMobile
     */
    public void setOptimisedForMobile(Boolean OptimisedForMobile) {
        this.OptimisedForMobile = OptimisedForMobile;
    }

    /**
     * 
     * @return
     *     The BookingNumber
     */
    public String getBookingNumber() {
        return BookingNumber;
    }

    /**
     * 
     * @param BookingNumber
     *     The BookingNumber
     */
    public void setBookingNumber(String BookingNumber) {
        this.BookingNumber = BookingNumber;
    }

    /**
     * 
     * @return
     *     The Type
     */
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }
}
