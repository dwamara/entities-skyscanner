package com.skyscanner.flight.api.entity.geo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Airport {

	@SerializedName("CityId") @Expose private String cityId;
	@SerializedName("CountryId") @Expose private String countryId;
	@SerializedName("Location") @Expose private String location;
	@SerializedName("Id") @Expose private String id;
	@SerializedName("Name") @Expose private String name;

	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
