package com.shopify.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shopify.model.adapters.EscapedStringAdapter;
import com.shopify.model.adapters.InventoryPolicyAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyVariant {

	private String id;
	@XmlElement(name = "product_id")
	private String productId;
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String title;
	private BigDecimal price;
	@XmlElement(name = "compare_at_price")
	private BigDecimal compareAtPrice;
	private String sku;
	private String barcode;
	private int position;
	private long grams;

	@XmlElement(name = "inventory_quantity")
	private Long inventoryQuantity;
	@XmlElement(name = "image_id")
	private String imageId;
	@XmlElement(name = "created_at")
	private String createdAt;
	@XmlElement(name = "updated_at")
	private String updatedAt;
	@XmlJavaTypeAdapter(InventoryPolicyAdapter.class)
	@XmlElement(name = "inventory_policy")
	private InventoryPolicy inventoryPolicy;
	@XmlElement(name = "inventory_management")
	private String inventoryManagement;
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String option1;
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String option2;
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String option3;
	@XmlElement(name = "fulfillment_service")
	private String fulfillmentService;
	@XmlElement(name = "requires_shipping")
	private boolean requiresShipping;
	private boolean taxable;

	@XmlElement(name = "tax_code")
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String taxCode;
	@XmlElement(name = "inventory_item_id")
	private String inventoryItemId;

	@XmlElement(name = "weight_unit")
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String weightUnit;

	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String weight;
	@XmlElement(name = "presentment_prices")
	private List<ShopifyVariantPresentmentPrice> presentmentPrices = new ArrayList<>();

	@XmlTransient
	private long available;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(final String productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getCompareAtPrice() {
		return compareAtPrice;
	}

	public void setCompareAtPrice(final BigDecimal compareAtPrice) {
		this.compareAtPrice = compareAtPrice;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(final String sku) {
		this.sku = sku;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(final String barcode) {
		this.barcode = barcode;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(final int position) {
		this.position = position;
	}

	public long getGrams() {
		return grams;
	}

	public void setGrams(final long grams) {
		this.grams = grams;
	}

	public Long getInventoryQuantity() {
		return inventoryQuantity;
	}

	public void setInventoryQuantity(final Long inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(final String imageId) {
		this.imageId = imageId;
	}

	public InventoryPolicy getInventoryPolicy() {
		return inventoryPolicy;
	}

	public void setInventoryPolicy(final InventoryPolicy inventoryPolicy) {
		this.inventoryPolicy = inventoryPolicy;
	}

	public String getInventoryManagement() {
		return inventoryManagement;
	}

	public void setInventoryManagement(final String inventoryManagement) {
		this.inventoryManagement = inventoryManagement;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(final String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(final String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(final String option3) {
		this.option3 = option3;
	}

	public String getFulfillmentService() {
		return fulfillmentService;
	}

	public void setFulfillmentService(final String fulfillmentService) {
		this.fulfillmentService = fulfillmentService;
	}

	public boolean isRequiresShipping() {
		return requiresShipping;
	}

	public void setRequiresShipping(final boolean requiresShipping) {
		this.requiresShipping = requiresShipping;
	}

	public boolean isTaxable() {
		return taxable;
	}

	public void setTaxable(final boolean taxable) {
		this.taxable = taxable;
	}

	public String getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(final String inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public long getAvailable() {
		return available;
	}

	public void setAvailable(final long available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "ShopifyVariant{" +
				"id='" + id + '\'' +
				", productId='" + productId + '\'' +
				", title='" + title + '\'' +
				", price=" + price +
				", compareAtPrice=" + compareAtPrice +
				", sku='" + sku + '\'' +
				", barcode='" + barcode + '\'' +
				", position=" + position +
				", grams=" + grams +
				", inventoryQuantity=" + inventoryQuantity +
				", imageId='" + imageId + '\'' +
				", inventoryPolicy=" + inventoryPolicy +
				", inventoryManagement='" + inventoryManagement + '\'' +
				", option1='" + option1 + '\'' +
				", option2='" + option2 + '\'' +
				", option3='" + option3 + '\'' +
				", fulfillmentService='" + fulfillmentService + '\'' +
				", requiresShipping=" + requiresShipping +
				", taxable=" + taxable +
				", inventoryItemId='" + inventoryItemId + '\'' +
				", available=" + available +
				'}';
	}

	public List<ShopifyVariantPresentmentPrice> getPresentmentPrices() {
		return presentmentPrices;
	}

	public void setPresentmentPrices(List<ShopifyVariantPresentmentPrice> presentmentPrices) {
		this.presentmentPrices = presentmentPrices;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
}
