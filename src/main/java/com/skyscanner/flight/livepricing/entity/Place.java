
package com.skyscanner.flight.livepricing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Place {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("ParentId")
    @Expose
    private Integer parentId;
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId
     *     The ParentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The Code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The Name
     */
    public void setName(String name) {
        this.name = name;
    }

}
