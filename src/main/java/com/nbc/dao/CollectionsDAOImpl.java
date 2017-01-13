package com.nbc.dao;

import com.nbc.model.Collections;
import org.bson.types.ObjectId;

/**
 * CollectionsDAOImpl
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: CollectionsDAOImpl.java Jan 13, 2017 20:47:36 nbccong $
 * @since 1.0
 */
public class CollectionsDAOImpl extends AbstractBaseDao implements BaseDAO<Collections> {
  @Override
  public Collections query() {
    return null;
  }

  @Override
  public Collections load(ObjectId id) {
    return mongoTemplate.findById(id, Collections.class);
  }

  @Override
  public ObjectId insert(Collections entity) {
    mongoTemplate.insert(entity);
    return entity.getId();
  }

  @Override
  public void update(ObjectId id, Collections entity) {

  }

  @Override
  public void remove(ObjectId id) {

  }
}
