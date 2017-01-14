package com.nbc.services;

import com.nbc.dao.BaseDAO;
import com.nbc.data.ListData;
import org.apache.log4j.Logger;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Query;

/**
 * AbstractService
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: AbstractService.java Jan 13, 2017 23:23:40 nbccong $
 * @since 1.0
 */
public abstract class AbstractService<T> implements BaseService<T> {
  protected static final Logger logger = Logger.getLogger(AbstractService.class);

  private BaseDAO dao;

  protected BaseDAO getDao() {
    return dao;
  }

  protected void setDao(BaseDAO dao) {
    this.dao = dao;
  }

  @Override
  @SuppressWarnings("unchecked")
  public ObjectId add(T entry) {
    return getDao().insert(entry);
  }

  @Override
  @SuppressWarnings("unchecked")
  public void update(ObjectId id, T entry) {
    getDao().update(id, entry);
  }

  @Override
  public void remove(ObjectId id) {
    getDao().remove(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public T get(ObjectId id) {
    return (T) getDao().load(id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ListData<T> get() {
    return new ListData<T>(getDao().query());
  }

  @Override
  @SuppressWarnings("unchecked")
  public ListData<T> get(Query query) {
    return new ListData<T>(getDao().query(query));
  }
}
