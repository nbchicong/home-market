package com.nbc.dao;

import com.nbc.model.Collections;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * CollectionsDAOImpl
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: CollectionsDAOImpl.java Jan 13, 2017 20:47:36 nbccong $
 * @since 1.0
 */
public class CollectionsDAOImpl extends AbstractBaseDao implements BaseDAO<Collections> {
  @Override
  public List<Collections> query() {
    return mongoTemplate.findAll(Collections.class);
  }

  @Override
  public List<Collections> query(Query query) {
    return mongoTemplate.find(query, Collections.class);
  }

  @Override
  public int count(Query query) {
    return (int) mongoTemplate.count(query, Collections.class);
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
    Query query = new Query();
    query.addCriteria(Criteria.where("id").is(id));

    final Collections item = mongoTemplate.findOne(query, Collections.class);

    if (item.getId().equals(entity.getId())) {
      mongoTemplate.save(entity);
    }
  }

  @Override
  public void remove(ObjectId id) {
    final Collections item = load(id);
    if (item != null)
      mongoTemplate.remove(item);
  }
}
