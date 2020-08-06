package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyErrorsRoot {

	private ShopifyErrors errors = new ShopifyErrors();

	public ShopifyErrors getErrors() {
		return errors;
	}

	public void setErrors(ShopifyErrors errors) {
		this.errors = errors;
	}

}
