
package com.skyscanner.hotel.entity.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hotel {
    @SerializedName("name") @Expose private String name;
    @SerializedName("types") @Expose private List<String> types = null;
    @SerializedName("hotel_id") @Expose private Integer hotelId;
    @SerializedName("description") @Expose private String description;
    @SerializedName("address") @Expose private String address;
    @SerializedName("district") @Expose private Integer district;
    @SerializedName("number_of_rooms") @Expose private Integer numberOfRooms;
    @SerializedName("popularity") @Expose private Integer popularity;
    @SerializedName("popularity_desc") @Expose private String popularityDesc;
    @SerializedName("amenities") @Expose private List<String> amenities = null;
    @SerializedName("latitude") @Expose private Double latitude;
    @SerializedName("longitude") @Expose private Double longitude;
    @SerializedName("image_urls") @Expose private List<String> imageUrls = null;
    @SerializedName("score") @Expose private Integer score;
    @SerializedName("tag") @Expose private String tag;
    @SerializedName("star_rating") @Expose private Integer starRating;
    @SerializedName("distance_from_search") @Expose private Double distanceFromSearch;
    @SerializedName("url") @Expose private String url;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return types;
    }
    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Integer getHotelId() {
        return hotelId;
    }
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDistrict() {
        return district;
    }
    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getPopularity() {
        return popularity;
    }
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getPopularityDesc() {
        return popularityDesc;
    }
    public void setPopularityDesc(String popularityDesc) {
        this.popularityDesc = popularityDesc;
    }

    public List<String> getAmenities() {
        return amenities;
    }
    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }
    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getStarRating() {
        return starRating;
    }
    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    public Double getDistanceFromSearch() {
        return distanceFromSearch;
    }
    public void setDistanceFromSearch(Double distanceFromSearch) {
        this.distanceFromSearch = distanceFromSearch;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}