package com.nbc.dao;

import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * AbstractBaseDao
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: AbstractBaseDao.java Dec 28, 2016 23:56:10 nbccong $
 * @since 1.0
 */
public abstract class AbstractBaseDao {
  protected MongoTemplate mongoTemplate;

  public void setMongoTemplate(MongoTemplate template) {
    this.mongoTemplate = template;
  }

  public MongoTemplate getMongoTemplate() {
    return this.mongoTemplate;
  }
}
