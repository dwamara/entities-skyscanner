
package com.skyscanner.hotel.entity.detail;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomOffer {

    @SerializedName("meal_plan")
    @Expose
    private String mealPlan;
    @SerializedName("policy_dto")
    @Expose
    private PolicyDto policyDto;
    @SerializedName("rooms")
    @Expose
    private List<Room> rooms = null;
    @SerializedName("available")
    @Expose
    private Integer available;

    /**
     * 
     * @return
     *     The mealPlan
     */
    public String getMealPlan() {
        return mealPlan;
    }

    /**
     * 
     * @param mealPlan
     *     The meal_plan
     */
    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    /**
     * 
     * @return
     *     The policyDto
     */
    public PolicyDto getPolicyDto() {
        return policyDto;
    }

    /**
     * 
     * @param policyDto
     *     The policy_dto
     */
    public void setPolicyDto(PolicyDto policyDto) {
        this.policyDto = policyDto;
    }

    /**
     * 
     * @return
     *     The rooms
     */
    public List<Room> getRooms() {
        return rooms;
    }

    /**
     * 
     * @param rooms
     *     The rooms
     */
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * 
     * @return
     *     The available
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    public void setAvailable(Integer available) {
        this.available = available;
    }

}
