package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyCustomerRoot {

	private ShopifyCustomer customer;

	public ShopifyCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(final ShopifyCustomer customer) {
		this.customer = customer;
	}

}
