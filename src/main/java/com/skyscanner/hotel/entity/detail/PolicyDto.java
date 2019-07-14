
package com.skyscanner.hotel.entity.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PolicyDto {

    @SerializedName("cancellation")
    @Expose
    private String cancellation;
    @SerializedName("cancellation_code")
    @Expose
    private Integer cancellationCode;

    /**
     * 
     * @return
     *     The cancellation
     */
    public String getCancellation() {
        return cancellation;
    }

    /**
     * 
     * @param cancellation
     *     The cancellation
     */
    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }

    /**
     * 
     * @return
     *     The cancellationCode
     */
    public Integer getCancellationCode() {
        return cancellationCode;
    }

    /**
     * 
     * @param cancellationCode
     *     The cancellation_code
     */
    public void setCancellationCode(Integer cancellationCode) {
        this.cancellationCode = cancellationCode;
    }

}
