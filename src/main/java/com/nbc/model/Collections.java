package com.nbc.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Collections
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: Collections.java Dec 31, 2016 01:02:52 nbccong $
 * @since 1.0
 */
public class Collections {
  @Id
  private ObjectId id;
  private String name;
  private String iconCls;
  private ObjectId parentId;

  private int countView = 0;
  private int countProduct = 0;

  private ProductEntity newestProduct;

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIconCls() {
    return iconCls;
  }

  public void setIconCls(String iconCls) {
    this.iconCls = iconCls;
  }

  public ObjectId getParentId() {
    return parentId;
  }

  public void setParentId(ObjectId parentId) {
    this.parentId = parentId;
  }

  public int getCountView() {
    return countView;
  }

  public void setCountView(int countView) {
    this.countView = countView;
  }

  public int getCountProduct() {
    return countProduct;
  }

  public void setCountProduct(int countProduct) {
    this.countProduct = countProduct;
  }

  public ProductEntity getNewestProduct() {
    return newestProduct;
  }

  public void setNewestProduct(ProductEntity newestProduct) {
    this.newestProduct = newestProduct;
  }

  @Override
  public String toString() {
    return "Collections{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", iconCls='" + iconCls + '\'' +
        ", parentId=" + parentId +
        ", countView=" + countView +
        ", countProduct=" + countProduct +
        ", newestProduct=" + newestProduct +
        '}';
  }
}
