package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyGiftCardRoot {
	@XmlElement(name = "gift_card")
	private ShopifyGiftCard giftCard;

	public ShopifyGiftCard getGiftCard() {
		return giftCard;
	}

	public void setGiftCard(final ShopifyGiftCard giftCard) {
		this.giftCard = giftCard;
	}

}
