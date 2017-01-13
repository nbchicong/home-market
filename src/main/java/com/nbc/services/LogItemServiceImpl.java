package com.nbc.services;

import com.nbc.dao.BaseDAO;
import com.nbc.model.LogItem;
import org.apache.log4j.Logger;
import org.bson.types.ObjectId;

/**
 * LogItemServiceImpl
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: LogItemServiceImpl.java Dec 29, 2016 00:04:24 nbccong $
 * @since 1.0
 */
public class LogItemServiceImpl implements LogService<LogItem> {
  private static final Logger logger = Logger.getLogger(LogItemServiceImpl.class);

  private BaseDAO dao;

  public BaseDAO getDao() {
    return dao;
  }

  public void setDao(BaseDAO dao) {
    this.dao = dao;
  }

  @SuppressWarnings("unchecked")
  public ObjectId add(LogItem log) {
    logger.debug("Adding a new LogItem instance");
    return getDao().insert(log);
  }

  public LogItem get(ObjectId id) {
    return (LogItem) getDao().load(id);
  }
}
