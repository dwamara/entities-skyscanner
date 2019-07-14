
package com.skyscanner.flight.livepricing.entity.sessionpolling;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Place {

    @SerializedName("Id")
    @Expose
    private Integer Id;
    @SerializedName("Code")
    @Expose
    private String Code;
    @SerializedName("Type")
    @Expose
    private String Type;
    @SerializedName("Name")
    @Expose
    private String Name;

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
     *     The Code
     */
    public String getCode() {
        return Code;
    }

    /**
     * 
     * @param Code
     *     The Code
     */
    public void setCode(String Code) {
        this.Code = Code;
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
}
