package com.nbc.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * BaseDAO for Hibernate Entities
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: BaseDAO.java Dec 28, 2016 23:54:43 nbccong $
 * @since 1.0
 */

public interface BaseDAO<T> {
  List<T> query();
  List<T> query(Query query);
  int count(Query query);
  T load(ObjectId id);
  ObjectId insert(T entity);
  void update(ObjectId id, T entity);
  void remove(ObjectId id);
}
