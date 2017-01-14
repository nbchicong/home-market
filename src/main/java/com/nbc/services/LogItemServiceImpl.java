package com.nbc.services;

import com.nbc.data.ListData;
import com.nbc.model.LogItem;
import org.springframework.data.mongodb.core.query.Query;

/**
 * LogItemServiceImpl
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: LogItemServiceImpl.java Dec 29, 2016 00:04:24 nbccong $
 * @since 1.0
 */
public class LogItemServiceImpl extends AbstractService<LogItem> {

  @Override
  public ListData<LogItem> get() {
    return null;
  }

  @Override
  public ListData<LogItem> get(Query query) {
    return null;
  }
}
