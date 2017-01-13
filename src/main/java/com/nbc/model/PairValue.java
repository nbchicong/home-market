package com.nbc.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * PairValue
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: PairValue.java Jan 13, 2017 17:26:57 nbccong $
 * @since 1.0
 */
public class PairValue {
  @Id
  private ObjectId id;
  private String name;
  private String value;

  private String iconCls;

  private long created = 0L;
  private long lastUpdated = 0L;

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

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getIconCls() {
    return iconCls;
  }

  public void setIconCls(String iconCls) {
    this.iconCls = iconCls;
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
