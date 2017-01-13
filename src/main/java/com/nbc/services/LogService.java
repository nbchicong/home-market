package com.nbc.services;

import org.bson.types.ObjectId;

/**
 * LogService
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: LogService.java Dec 29, 2016 00:03:01 nbccong $
 * @since 1.0
 */

public interface LogService<T> {
  public ObjectId add(T log);
  public T get(ObjectId id);
}
