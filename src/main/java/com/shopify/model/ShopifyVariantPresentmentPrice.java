package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyVariantPresentmentPrice {
    private ShopifyVariantPrice price;
    @XmlElement(name = "compare_at_price")
    private String compareAtPrice;

    public ShopifyVariantPrice getPrice() {
        return price;
    }

    public void setPrice(ShopifyVariantPrice price) {
        this.price = price;
    }

    public String getCompareAtPrice() {
        return compareAtPrice;
    }

    public void setCompareAtPrice(String compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
    }

    public static List<ShopifyVariantPresentmentPrice> defaultPresentment(String amount, String compareAtPrice) {
        ShopifyVariantPresentmentPrice item = new ShopifyVariantPresentmentPrice();
        item.setCompareAtPrice(compareAtPrice);
        item.setPrice(ShopifyVariantPrice.with(amount));
        return Arrays.asList(item);
    }
}