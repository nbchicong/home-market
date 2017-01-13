package com.nbc.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * LogItem
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: LogItem.java Dec 28, 2016 23:50:21 nbccong $
 * @since 1.0
 */

@Document(collection = "log-items")
public class LogItem implements Serializable {

  @Id
  private ObjectId id;
  private String message;
  private String timestamp;

  public LogItem() {}

  public LogItem(String message) {
    this.message = message;
  }

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public String toString() {
    return "LogItem{" +
        "id=" + id +
        ", message='" + message + '\'' +
        ", timestamp='" + timestamp + '\'' +
        '}';
  }
}
