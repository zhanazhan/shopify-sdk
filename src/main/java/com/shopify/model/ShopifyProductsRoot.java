package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyProductsRoot {

	private List<ShopifyProduct> products = new LinkedList<ShopifyProduct>();

	public List<ShopifyProduct> getProducts() {
		return products;
	}

	public void setProducts(List<ShopifyProduct> products) {
		this.products = products;
	}
}
