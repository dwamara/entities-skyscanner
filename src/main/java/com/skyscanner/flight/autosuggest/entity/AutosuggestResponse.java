package com.skyscanner.flight.autosuggest.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AutosuggestResponse {

	@SerializedName("Places") @Expose private List<Place> places = null;

	public List<Place> getPlaces() {
		return places;
	}
	public void setPlaces(List<Place> places) {
		this.places = places;
	}

}
