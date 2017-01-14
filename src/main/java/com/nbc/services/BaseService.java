package com.nbc.services;

import com.nbc.data.ListData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Query;

/**
 * BaseService
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: BaseService.java Dec 29, 2016 00:03:01 nbccong $
 * @since 1.0
 */

public interface BaseService<T> {
  public ObjectId add(T entry);
  public void update(ObjectId id, T entry);
  public void remove(ObjectId id);
  public T get(ObjectId id);
  public ListData<T> get();
  public ListData<T> get(Query query);
}
