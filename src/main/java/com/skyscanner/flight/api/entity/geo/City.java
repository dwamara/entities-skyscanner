package com.skyscanner.flight.api.entity.geo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class City {

	@SerializedName("SingleAirportCity") @Expose private Boolean singleAirportCity;
	@SerializedName("Airports") @Expose private List<Airport> airports = new ArrayList<>();
	@SerializedName("CountryId") @Expose private String countryId;
	@SerializedName("Location") @Expose private String location;
	@SerializedName("IataCode") @Expose private String iataCode;
	@SerializedName("Id") @Expose private String id;
	@SerializedName("Name") @Expose private String name;

	public Boolean getSingleAirportCity() {
		return singleAirportCity;
	}
	public void setSingleAirportCity(Boolean singleAirportCity) {
		this.singleAirportCity = singleAirportCity;
	}

	public List<Airport> getAirports() {
		return airports;
	}
	public void setAirports(List<Airport> airports) {
		this.airports = airports;
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

	public String getIataCode() {
		return iataCode;
	}
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
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
