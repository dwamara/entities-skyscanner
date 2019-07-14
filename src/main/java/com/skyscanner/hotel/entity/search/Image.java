
package com.skyscanner.hotel.entity.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Image {

    @SerializedName("rmt.jpg")
    @Expose
    private List<Integer> rmtJpg = null;
    @SerializedName("rmc.jpg")
    @Expose
    private List<Integer> rmcJpg = null;
    @SerializedName("morig.jpg")
    @Expose
    private List<Integer> morigJpg = null;
    @SerializedName("mc.jpg")
    @Expose
    private List<Integer> mcJpg = null;
    @SerializedName("rmf.jpg")
    @Expose
    private List<Integer> rmfJpg = null;
    @SerializedName("provider")
    @Expose
    private List<Integer> provider = null;
    @SerializedName("rmca.jpg")
    @Expose
    private List<Integer> rmcaJpg = null;
    @SerializedName("order")
    @Expose
    private List<Integer> order = null;

    /**
     * 
     * @return
     *     The rmtJpg
     */
    public List<Integer> getRmtJpg() {
        return rmtJpg;
    }

    /**
     * 
     * @param rmtJpg
     *     The rmt.jpg
     */
    public void setRmtJpg(List<Integer> rmtJpg) {
        this.rmtJpg = rmtJpg;
    }

    /**
     * 
     * @return
     *     The rmcJpg
     */
    public List<Integer> getRmcJpg() {
        return rmcJpg;
    }

    /**
     * 
     * @param rmcJpg
     *     The rmc.jpg
     */
    public void setRmcJpg(List<Integer> rmcJpg) {
        this.rmcJpg = rmcJpg;
    }

    /**
     * 
     * @return
     *     The morigJpg
     */
    public List<Integer> getMorigJpg() {
        return morigJpg;
    }

    /**
     * 
     * @param morigJpg
     *     The morig.jpg
     */
    public void setMorigJpg(List<Integer> morigJpg) {
        this.morigJpg = morigJpg;
    }

    /**
     * 
     * @return
     *     The mcJpg
     */
    public List<Integer> getMcJpg() {
        return mcJpg;
    }

    /**
     * 
     * @param mcJpg
     *     The mc.jpg
     */
    public void setMcJpg(List<Integer> mcJpg) {
        this.mcJpg = mcJpg;
    }

    /**
     * 
     * @return
     *     The rmfJpg
     */
    public List<Integer> getRmfJpg() {
        return rmfJpg;
    }

    /**
     * 
     * @param rmfJpg
     *     The rmf.jpg
     */
    public void setRmfJpg(List<Integer> rmfJpg) {
        this.rmfJpg = rmfJpg;
    }

    /**
     * 
     * @return
     *     The provider
     */
    public List<Integer> getProvider() {
        return provider;
    }

    /**
     * 
     * @param provider
     *     The provider
     */
    public void setProvider(List<Integer> provider) {
        this.provider = provider;
    }

    /**
     * 
     * @return
     *     The rmcaJpg
     */
    public List<Integer> getRmcaJpg() {
        return rmcaJpg;
    }

    /**
     * 
     * @param rmcaJpg
     *     The rmca.jpg
     */
    public void setRmcaJpg(List<Integer> rmcaJpg) {
        this.rmcaJpg = rmcaJpg;
    }

    /**
     * 
     * @return
     *     The order
     */
    public List<Integer> getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    public void setOrder(List<Integer> order) {
        this.order = order;
    }

}
