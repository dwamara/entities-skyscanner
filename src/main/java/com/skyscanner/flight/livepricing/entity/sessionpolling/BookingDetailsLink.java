
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class BookingDetailsLink {

    @SerializedName("Uri")
    @Expose
    private String Uri;
    @SerializedName("Body")
    @Expose
    private String Body;
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * 
     * @return
     *     The Uri
     */
    public String getUri() {
        return Uri;
    }

    /**
     * 
     * @param Uri
     *     The Uri
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * 
     * @return
     *     The Body
     */
    public String getBody() {
        return Body;
    }

    /**
     * 
     * @param Body
     *     The Body
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * 
     * @return
     *     The Method
     */
    public String getMethod() {
        return Method;
    }

    /**
     * 
     * @param Method
     *     The Method
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }
}
