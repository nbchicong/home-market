package com.nbc.dao;

import com.nbc.data.ListData;
import com.nbc.model.LogItem;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * LogItemDaoImpl
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: LogItemDaoImpl.java Dec 29, 2016 00:00:05 nbccong $
 * @since 1.0
 */
public class LogItemDaoImpl extends AbstractBaseDao implements BaseDAO<LogItem> {
  @Override
  public List<LogItem> query() {
    return mongoTemplate.findAll(LogItem.class);
  }

  @Override
  public List<LogItem> query(Query query) {
    return mongoTemplate.find(query, LogItem.class);
  }

  @Override
  public int count(Query query) {
    return (int) mongoTemplate.count(query, LogItem.class);
  }

  @Override
  public LogItem load(ObjectId id) {
    return mongoTemplate.findById(id, LogItem.class);
  }

  @Override
  public ObjectId insert(LogItem entity) {
    mongoTemplate.insert(entity);
    return entity.getId();
  }

  @Override
  public void update(ObjectId id, LogItem entity) {
    Query query = new Query();
    query.addCriteria(Criteria.where("id").is(id));

    final LogItem item = mongoTemplate.findOne(query, LogItem.class);

    if (item.getId().equals(entity.getId())) {
      mongoTemplate.save(entity);
    }
  }

  @Override
  public void remove(ObjectId id) {

  }
}
