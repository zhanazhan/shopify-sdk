package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyFulfillmentRoot {

	private ShopifyFulfillment fulfillment;

	public ShopifyFulfillment getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(ShopifyFulfillment fulfillment) {
		this.fulfillment = fulfillment;
	}

}
