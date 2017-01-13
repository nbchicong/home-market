package com.nbc.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Variant
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: Variant.java Jan 13, 2017 16:05:56 nbccong $
 * @since 1.0
 */
@Document(collection = "variants")
public class Variant {
  @Id
  private ObjectId id;
  private String code;

  private String sizeText;
  private String sizeNumber;

  private String colorCode;
  private String colorText;

  private int quantity = 0;
  private String brief;

  private long price;
  private long priceSale = 0L;

  private int discountPercent = 0;
  private long discountValue = 0L;

  private boolean saleOff = false;

  @NotNull
  private ObjectId productId;

  @NotNull
  private long created = new Date().getTime();
  private long lastUpdated = 0L;

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getSizeText() {
    return sizeText;
  }

  public void setSizeText(String sizeText) {
    this.sizeText = sizeText;
  }

  public String getSizeNumber() {
    return sizeNumber;
  }

  public void setSizeNumber(String sizeNumber) {
    this.sizeNumber = sizeNumber;
  }

  public String getColorCode() {
    return colorCode;
  }

  public void setColorCode(String colorCode) {
    this.colorCode = colorCode;
  }

  public String getColorText() {
    return colorText;
  }

  public void setColorText(String colorText) {
    this.colorText = colorText;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getBrief() {
    return brief;
  }

  public void setBrief(String brief) {
    this.brief = brief;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public long getPriceSale() {
    return priceSale;
  }

  public void setPriceSale(long priceSale) {
    this.priceSale = priceSale;
  }

  public int getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(int discountPercent) {
    this.discountPercent = discountPercent;
  }

  public long getDiscountValue() {
    return discountValue;
  }

  public void setDiscountValue(long discountValue) {
    this.discountValue = discountValue;
  }

  public boolean isSaleOff() {
    return saleOff;
  }

  public void setSaleOff(boolean saleOff) {
    this.saleOff = saleOff;
  }

  public ObjectId getProductId() {
    return productId;
  }

  public void setProductId(ObjectId productId) {
    this.productId = productId;
  }

  public long getCreated() {
    return created;
  }

  public void setCreated(long created) {
    this.created = created;
  }

  public long getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }
}
