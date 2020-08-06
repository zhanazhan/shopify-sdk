package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyCustomCollectionRoot {

	@XmlElement(name = "custom_collection")
	private ShopifyCustomCollection customCollection;

	public ShopifyCustomCollection getCustomCollection() {
		return customCollection;
	}

	public void setCustomCollection(ShopifyCustomCollection customCollection) {
		this.customCollection = customCollection;
	}
}
