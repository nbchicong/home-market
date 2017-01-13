package com.nbc.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ProductEntity
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: ProductEntity.java Dec 31, 2016 06:55:15 nbccong $
 * @since 1.0
 */
@Document(collection = "products")
public class ProductEntity {
  @Id
  private ObjectId id;
  private String code;

  private String name;
  private String nameCode;

  private String brief;
  private String description;
  private String warrantyInfo;
  private String deliveryInfo;
  private String paymentInfo;

  private String vendorName;
  private String vendorCode;

  private String typeName;
  private String typeCode;

  private long price = 0L;
  private long priceSale = 0L;

  private int priority = 0;

  private ObjectId partnerId;

  private List<String> images = new ArrayList<String>();

  private List<Variant> variants = new ArrayList<Variant>();

  private List<PairValue> privacy = new ArrayList<PairValue>();

  private String note;

  private boolean featured = false;
  private boolean locked = false;
  private boolean visible = false;
  private boolean saleOff = false;
  private boolean markDelete = false;

  private int discountPercent = 0;
  private long discountValue = 0L;
  private int totalQuantity = 0;
  private float rating = 0F;

  private int countView = 0;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNameCode() {
    return nameCode;
  }

  public void setNameCode(String nameCode) {
    this.nameCode = nameCode;
  }

  public String getBrief() {
    return brief;
  }

  public void setBrief(String brief) {
    this.brief = brief;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getWarrantyInfo() {
    return warrantyInfo;
  }

  public void setWarrantyInfo(String warrantyInfo) {
    this.warrantyInfo = warrantyInfo;
  }

  public String getDeliveryInfo() {
    return deliveryInfo;
  }

  public void setDeliveryInfo(String deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }

  public String getPaymentInfo() {
    return paymentInfo;
  }

  public void setPaymentInfo(String paymentInfo) {
    this.paymentInfo = paymentInfo;
  }

  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
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

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public ObjectId getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(ObjectId partnerId) {
    this.partnerId = partnerId;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public List<Variant> getVariants() {
    return variants;
  }

  public void setVariants(List<Variant> variants) {
    this.variants = variants;
  }

  public List<PairValue> getPrivacy() {
    return privacy;
  }

  public void setPrivacy(List<PairValue> privacy) {
    this.privacy = privacy;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public boolean isFeatured() {
    return featured;
  }

  public void setFeatured(boolean featured) {
    this.featured = featured;
  }

  public boolean isLocked() {
    return locked;
  }

  public void setLocked(boolean locked) {
    this.locked = locked;
  }

  public boolean isVisible() {
    return visible;
  }

  public void setVisible(boolean visible) {
    this.visible = visible;
  }

  public boolean isSaleOff() {
    return saleOff;
  }

  public void setSaleOff(boolean saleOff) {
    this.saleOff = saleOff;
  }

  public boolean isMarkDelete() {
    return markDelete;
  }

  public void setMarkDelete(boolean markDelete) {
    this.markDelete = markDelete;
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

  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  public float getRating() {
    return rating;
  }

  public void setRating(float rating) {
    this.rating = rating;
  }

  public int getCountView() {
    return countView;
  }

  public void setCountView(int countView) {
    this.countView = countView;
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
