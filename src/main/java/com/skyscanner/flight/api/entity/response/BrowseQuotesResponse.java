package com.skyscanner.flight.api.entity.response;

import com.skyscanner.flight.api.entity.commons.Carrier;
import com.skyscanner.flight.api.entity.commons.Currency;
import com.skyscanner.flight.api.entity.commons.Place;
import com.skyscanner.flight.api.entity.commons.Quote;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class BrowseQuotesResponse {
	@SerializedName("Quotes") @Expose protected List<Quote> quotes = new ArrayList<>();
	@SerializedName("Places") @Expose protected List<Place> places = new ArrayList<>();
	@SerializedName("Carriers") @Expose protected List<Carrier> carriers = new ArrayList<>();
	@SerializedName("Currencies") @Expose protected List<Currency> currencies = new ArrayList<>();

	public List<Place> getPlaces() {
		return places;
	}
	public void setPlaces(List<Place> places) {
		this.places = places;
	}

	public List<Carrier> getCarriers() {
		return carriers;
	}
	public void setCarriers(List<Carrier> carriers) {
		this.carriers = carriers;
	}

	public List<Currency> getCurrencies() {
		return currencies;
	}
	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}

	public List<Quote> getQuotes() {
		return quotes;
	}
	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}
}
